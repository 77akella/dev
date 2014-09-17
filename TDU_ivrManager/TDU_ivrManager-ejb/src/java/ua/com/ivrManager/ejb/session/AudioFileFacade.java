/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.ejb.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ua.com.ivrManager.ejb.entity.AudioFile;


/**
 *
 * @author Artem
 */
@Stateless
public class AudioFileFacade extends AbstractFacade<AudioFile> {
    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AudioFileFacade() {
        super(AudioFile.class);
    }
}
