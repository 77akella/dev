package ua.com.ivrManager.ejb.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ua.com.ivrManager.ejb.entity.EmailTemplate;
import ua.com.ivrManager.ejb.entity.Var;

/**
 *
 * @author Artem
 */
@Stateless
public class EmailTemplateFacade extends AbstractFacade<EmailTemplate> {
    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmailTemplateFacade() {
        super(EmailTemplate.class);
    }

    public Var editVar(Var var){
        return getEntityManager().merge(var);
    }

    public Var findVar(Long id){
        return getEntityManager().find(Var.class,id);
    }

    public void removeVar(Var var){
        try {
            getEntityManager().remove(var);
        } catch (Exception e) {
        }
    }



//    public List<ImageFile> findAllImages() {
//        return QueryBundle.createReadAllQuery(getEntityManager(), ImageFile.class)
//                .appendBoolFilter("deleted", false)
//                .compile().getResultList();
//    }

}
