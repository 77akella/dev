package ua.com.aacc.webChat.admin.war.mBean.util;

import org.jboss.security.auth.spi.Util;
import ua.com.aacc.webChat.admin.war.mBean.AdministratorController;
import ua.com.aacc.webChat.entity.Administrator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

//import java.security.MessageDigest;

public class JsfUtil {

    public static SelectItem[] getSelectItems(List<?> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "---");
            i++;
        }
        for (Object x : entities) {
            items[i++] = new SelectItem(x, x.toString());
        }
        return items;
    }

    public static void addErrorMessage(Exception ex, String defaultMsg) {
        String msg = ex.getMessage();
        if (msg != null && msg.length() > 0) {
            addErrorMessage(msg);
        } else {
            addErrorMessage(defaultMsg);
        }
    }

    public static void addErrorMessages(List<String> messages) {
        for (String message : messages) {
            addErrorMessage(message);
        }
    }

    public static void addErrorMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, translate("Error"), translate(msg));
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    public static void addSuccessMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, translate("Successful"), translate(msg));
        FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
    }

    public static void addErrorMessage(String translete1, String notTranslete, String translete2) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, translate("Error"), translate(translete1) + " '" + notTranslete + "' " + translate(translete2));
        FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
    }

    public static void addSuccessMessage(String translete1, String notTranslete, String translete2) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, translate("Successful"), translate(translete1) + " '" + notTranslete + "' " + translate(translete2));
        FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
    }

    public static String getRequestParameter(String key) {
        return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(key);
    }

    public static Object getObjectFromRequestParameter(String requestParameterName, Converter converter, UIComponent component) {
        String theId = JsfUtil.getRequestParameter(requestParameterName);
        return converter.getAsObject(FacesContext.getCurrentInstance(), component, theId);
    }

    public static String translate(String text) {
        return ((AdministratorController) FacesContext.getCurrentInstance().getApplication().getELResolver().
                getValue(FacesContext.getCurrentInstance().getELContext(), null, "administratorController")).translate(text);
    }

    public static Administrator getCurrentAdmin() {
        return ((AdministratorController) FacesContext.getCurrentInstance().getApplication().getELResolver().
                getValue(FacesContext.getCurrentInstance().getELContext(), null, "administratorController")).getCurrent();
    }

    public static String hash(String username, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
//            //Create MessageDigest and encoding for input String
//            MessageDigest digest = MessageDigest.getInstance("SHA-256");
//            byte[] hash = digest.digest(password.getBytes("UTF-8"));
//
////////////        return Base64.encode(hash);
//            //Hash the Input String
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < hash.length; i++) {
//                sb.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
//            }
//            return sb.toString();
        return Util.createPasswordHash("SHA-256", "BASE64", null, username, password);
    }
}