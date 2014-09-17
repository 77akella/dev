
package ua.com.aacc.webChat.ejb;

import ua.com.aacc.webChat.entity.AbstractEntity;
import ua.com.aacc.webChat.entity.Administrator;
import ua.com.util.QueryBundle;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Artem Murashov
 */
public abstract class AbstractFacade<T extends AbstractEntity> {

    private Class<T> entityClass;
    @EJB
    private GlobalConfigurationSingletonFacade singletonFacade;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public AbstractFacade() {
    }

    protected abstract EntityManager getEntityManager();

    protected abstract Map<String,T> getCachedEntities();
    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public T edit(T entity, Administrator modBy) {
        entity.setModBy(modBy);
        entity = getEntityManager().merge(entity);
        getCachedEntities().put(entity.getId(),entity);
        return entity;
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
        getCachedEntities().remove(entity.getId());
    }

    public T find(Object id) {
        if(getCachedEntities().containsKey(id)){
            return getCachedEntities().get(id);
        }
        T entity=getEntityManager().find(entityClass, id);
        if(entity!=null&& entity.getId()!=null){
            getCachedEntities().put(entity.getId(),entity);
        }
        return entity;
    }

    protected QueryBundle createQueryBundle() {
        return new QueryBundle(getEntityManager(), entityClass);
    }

    protected QueryBundle createReadAllQueryBundle() {
        return QueryBundle.createReadAllQuery(getEntityManager(), entityClass);
    }

    protected Query createReadAllQuery() {
        return createReadAllQueryBundle().compile();
    }

    protected QueryBundle createReadCountQueryBundle() {
        return QueryBundle.createReadCountQuery(getEntityManager(), entityClass);
    }

    protected Query createReadCountQuery() {
        return createReadCountQueryBundle().compile();
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return QueryBundle.createReadAllQuery(getEntityManager(), entityClass)
                .compile().getResultList();
    }

//    public List<T> findAllDelAny() {
//        return QueryBundle.createReadAllQuery(getEntityManager(), entityClass)
//                .compile().getResultList();
//    }
//
//    public List<T> findRange(int[] range) {
//        Query q = createReadAllQuery();
//        q.setMaxResults(range[1] - range[0]);
//        q.setFirstResult(range[0]);
//        return q.getResultList();
//    }

    public int count() {
        return ((Long) createReadCountQuery().getSingleResult()).intValue();
    }

    //    public List<T> findAll(Class T){
//        QueryBundle qb = QueryBundle.createReadCountQuery(getEntityManager(), T).appendBoolFilter("deleted", false);
//        return qb.compile().getResultList();
//    }

    @SuppressWarnings("unchecked")
    public List<T> load(int start, int length, String order, boolean desc, Map<String, String> map) {
        return createReadAllQueryBundle()
                .appendOrder(order, desc).setFilter(map)
                .compile().setMaxResults(length).setFirstResult(start).getResultList();
    }

    public int loadCount(Map<String, String> filters) {
        return ((Long) createReadCountQueryBundle()
                .setFilter(filters)
                .compile().getSingleResult()).intValue();
    }

    @SuppressWarnings("unchecked")
    public List<T> load(int start, int length, String order, boolean desc, Map<String, String> map, String dateField, Date fromDate, Date toDate) {
        QueryBundle qb = createReadAllQueryBundle().appendOrder(order, desc).setFilter(map).appendBetweenFilter(dateField, fromDate, toDate);
        javax.persistence.Query q = qb.compile().setMaxResults(length).setFirstResult(start);
        return q.getResultList();
    }

//    public int loadCount(Map<String, String> filters, String dateField, Date fromDate, Date toDate) {
//        return ((Long) createReadCountQueryBundle().setFilter(filters)
//                .appendBetweenFilter(dateField, fromDate, toDate).compile().getSingleResult()).intValue();
//    }
}
