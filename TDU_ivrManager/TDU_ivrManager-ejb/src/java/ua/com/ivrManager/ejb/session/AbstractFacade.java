package ua.com.ivrManager.ejb.session;

import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import ua.com.ivrManager.util.QueryBundle;

/**
 *
 * @author Artem
 */
public abstract class AbstractFacade<T> {
    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public T edit(T entity) {
        return getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    protected QueryBundle createQueryBundle(){
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

    public List<T> findAll() {
        return QueryBundle.createReadAllQuery(getEntityManager(), entityClass)
                .appendBoolFilter("deleted", false)
                .compile().getResultList();
    }

    public List<T> findAllDelAny() {
        return QueryBundle.createReadAllQuery(getEntityManager(), entityClass)
                .compile().getResultList();
    }

    public List<T> findRange(int[] range) {
        Query q = createReadAllQuery();
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        return ((Long) createReadCountQuery().getSingleResult()).intValue();
    }

//    public List<T> findAll(Class T){
//        QueryBundle qb = QueryBundle.createReadCountQuery(getEntityManager(), T).appendBoolFilter("deleted", false);
//        return qb.compile().getResultList();
//    }

    public List<T> load(int start, int length, String order, boolean desc, Map<String, String> map) {
        return createReadAllQueryBundle()
                .appendOrder(order, desc).setFilter(map)
                .appendBoolFilter("deleted", false)
                .compile().setMaxResults(length).setFirstResult(start).getResultList();
    }

    public int loadCount(Map<String, String> filters) {
        return ((Long) createReadCountQueryBundle()
                .setFilter(filters)
                .appendBoolFilter("deleted", false)
                .compile().getSingleResult()).intValue();
    }


    public List<T> load(int start, int length, String order, boolean desc, Map<String, String> map, String dateField, Date fromDate, Date toDate) {
        QueryBundle qb = createReadAllQueryBundle().appendOrder(order, desc).setFilter(map).appendBetweenFilter(dateField, fromDate, toDate);
        javax.persistence.Query q = qb.compile().setMaxResults(length).setFirstResult(start);
        return q.getResultList();
    }

    public int loadCount(Map<String, String> filters, String dateField, Date fromDate, Date toDate) {
        return ((Long) createReadCountQueryBundle().setFilter(filters).appendBoolFilter("deleted", false).appendBetweenFilter(dateField, fromDate, toDate).compile().getSingleResult()).intValue();
    }


}