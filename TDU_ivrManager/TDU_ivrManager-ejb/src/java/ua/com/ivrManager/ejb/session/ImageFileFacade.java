package ua.com.ivrManager.ejb.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ua.com.ivrManager.ejb.entity.ImageFile;

/**
 *
 * @author Artem
 */
@Stateless
public class ImageFileFacade extends AbstractFacade<ImageFile> {
    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ImageFileFacade() {
        super(ImageFile.class);
    }

}
