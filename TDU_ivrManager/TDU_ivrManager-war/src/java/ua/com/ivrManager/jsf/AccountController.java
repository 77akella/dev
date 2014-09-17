package ua.com.ivrManager.jsf;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.Account;
import ua.com.ivrManager.ejb.entity.AccountGroup;
import ua.com.ivrManager.ejb.session.AccountFacade;
import ua.com.ivrManager.jsf.util.JsfUtil;

@ManagedBean(name = "accountController")
@SessionScoped
public class AccountController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
    private Account current;
    private Account selected;
    private List<String> toTranslate = new ArrayList<String>();
    private String oldPassword = "";
    private String newPassword = "";
    private LazyDataModel<Account> lazyModel = null;
    @EJB
    private ua.com.ivrManager.ejb.session.AccountFacade ejbFacade;

    public AccountController() {
    }

    public void loadData() {
        lazyModel = new LazyDataModel<Account>() {

            @Override
            public List<Account> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

                logger.info("[AccountController]  Loading data from lazyModel : sortField='{}', sortOrder='{}', filters: {}", new Object[]{sortField, sortOrder.name(), filters});
                List<Account> result = new ArrayList<Account>();

                try {
                    result = getFacade().load(first, pageSize, sortField, sortOrder == SortOrder.DESCENDING, filters);
                    lazyModel.setRowCount(getFacade().loadCount(filters));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("[AccountController]  Error Loading data from lazyModel: ", e);
                    JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
                }

                return result;
            }
        };
    }

    public LazyDataModel<Account> getLazyModel() {
        if (lazyModel == null) {
            loadData();
        }
        return lazyModel;
    }

    public String translate(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }
        if(text.trim().contains(" ")){
            return text;
        }
        try {
            if (getCurrent() != null) {
                return ResourceBundle.getBundle("/" + current.getLang()).getString(text);
            } else {
                return ResourceBundle.getBundle("/en").getString(text);
            }
        } catch (Exception e) {
            if (!toTranslate.contains(text + "=")) {
                toTranslate.add(text + "=");
            }
            return text;
        }
    }

    public String accountGroupsToString(List<AccountGroup> ags) {
        if (ags == null) {
            return null;
        }
        StringBuilder ret = new StringBuilder();
        for (AccountGroup ac : ags) {
            ret.append(translate(ac.getName())).append("\n");
        }
        return ret.toString();
    }

    public boolean isFailedTranslationsRendered() {
        return !toTranslate.isEmpty();
    }

    public String getToTransLate() {
        StringBuilder sb = new StringBuilder();
        for (String line : toTranslate) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    public Account getCurrent() {
        if (current == null) {
            try {
                current = ejbFacade.findByName(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getUserPrincipal().getName());
            } catch (Exception e) {
                logger.error("Can't get current user. Logging out.");
                logout();
            }

        }
        return current;
    }

    public void logout() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        logger.info("[AccountController] logout");
        if (session != null) {
            session.invalidate();
        }
        FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "/redirect.jsp");
    }

    public Account getSelected() {
        return selected;
    }

    public void setSelected(Account selected) {
        this.selected = selected;
    }

    private AccountFacade getFacade() {
        return ejbFacade;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public void prepareCreate() {
        logger.info("[AccountController] I am in prepareCreate");
        selected = new Account();
    }

    public void prepareEdit() {
        logger.info("[AccountController] I am in prepareEdit");
        selected = (Account) getLazyModel().getRowData();
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public boolean isAccountsEmpty() {
        return ejbFacade.isAccountsEmpty();
    }

    public void createAdminAccount() {
        try {
            assert ejbFacade.isAccountsEmpty();
            Account adminAccount = new Account();
            adminAccount.setLang("ru");
            adminAccount.setLogin("imadmin");
            adminAccount.setPassword(hash("imadmin01"));
            List<AccountGroup> accountGroups = new ArrayList<AccountGroup>();
            AccountGroup initGroups = new AccountGroup();
            initGroups.setName("admin");
            accountGroups.add(initGroups);
            adminAccount.setAccountGroups(accountGroups);
            ejbFacade.edit(adminAccount);
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
        }
    }

    public String updateCurrent() {
        try {
            if (hash(oldPassword).equals(current.getPassword())) {
                current.setModDate(new Date());
                if (!newPassword.isEmpty()) {
                    current.setPassword(hash(newPassword));
                }
                getFacade().edit(current);
                JsfUtil.addSuccessMessage("YourAccountUpdated");
                return null;
            } else {
                //Reset to default settings
                current = null;
                JsfUtil.addErrorMessage("WrongPassword");
                return null;
            }
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
            return null;
        }
    }

    public String updateSelected() {
        try {
            for (AccountGroup ag : current.getAccountGroups()) {
                if (ag.getName().equals("admin")) {
                    if (selected.getPassword().isEmpty()) {
                        JsfUtil.addErrorMessage("PleaseSetPassword");
                        return null;
                    }
                    selected.setModDate(new Date());
                    selected.setPassword(hash(selected.getPassword()));
                    getFacade().edit(selected);
                    JsfUtil.addSuccessMessage("AccountUpdated");
                    return prepareList();
                }
            }
            JsfUtil.addErrorMessage("PermissionDenied");
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
            return null;
        }
    }

    public void prepareDestroy() {
        selected = (Account) getLazyModel().getRowData();
    }

    public String destroy() {
        performDestroy();
        recreateModel();
        return prepareList();
    }

    private void performDestroy() {
        try {
            //current.setDeleted(true);
            //getFacade().edit(current);
            for (AccountGroup ag : current.getAccountGroups()) {
                if (ag.getName().equals("admin")) {
                    getFacade().remove(selected);
                    JsfUtil.addSuccessMessage(translate("AccountDeleted"));
                    return;
                }
            }
            JsfUtil.addErrorMessage(translate("PermissionDenied"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, translate("PersistenceErrorOccured"));
        }
    }

    private void recreateModel() {
        lazyModel = null;
        loadData();
    }
//
//    public SelectItem[] getItemsAvailableSelect() {
//        List<Account> entities = getFacade().findAll();
//        SelectItem[] items = new SelectItem[entities.size()];
//        int i = 0;
//        for (Account cf : entities) {
//            items[i++] = new SelectItem(cf, cf.getLogin());
//        }
//        return items;
//    }

    public SelectItem[] getGrousSelect() {
        List<AccountGroup> entities = getFacade().findAllGroups();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (AccountGroup cf : entities) {
            items[i++] = new SelectItem(cf, cf.getName());
        }
        return items;
    }

    public static String hash(String string) {
        try {
            //Create MessageDigest and encoding for input String
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(string.getBytes("UTF-8"));

            //Hash the Input String
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < hash.length; i++) {
                sb.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            logger.error("[AccountController]  Error: NoSuchAlgorithmException");
        } catch (UnsupportedEncodingException e) {
            logger.error("[AccountController]  Error: UnsupportedEncodingException");
        }

        return null;
    }

    @FacesConverter(forClass = AccountGroup.class, value = "accountGroupConverter")
    public static class AccountGroupConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            AccountController controller = (AccountController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "accountController");
            return controller.ejbFacade.findGroup(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof AccountGroup) {
                AccountGroup o = (AccountGroup) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + AccountController.class.getName());
            }
        }
    }
}
