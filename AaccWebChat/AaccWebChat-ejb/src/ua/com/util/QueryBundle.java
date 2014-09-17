package ua.com.util;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.*;
import java.util.*;

/**
 * @author Artem Murashov
 */
public class QueryBundle {

    Expression where;
    Root root;
    CriteriaQuery query;
    CriteriaBuilder builder;
    EntityManager em;
    List<Order> orders = new LinkedList<Order>();

    public QueryBundle(EntityManager em, Class entityClass) {
        this.em = em;
        builder = em.getCriteriaBuilder();
        query = builder.createQuery(entityClass);
        root = query.from(entityClass);
    }

    public QueryBundle setSelect(String path, boolean distinct) {
        query.select(createPath(path));
        query.distinct(distinct);
        return this;
    }

    public QueryBundle setSelect(String path) {
        return setSelect(path, true);
    }

    public static QueryBundle createReadAllQuery(EntityManager em, Class entityClass) {
        QueryBundle q = new QueryBundle(em, entityClass);
        q.query.select(q.root);
        return q;
    }

    public static QueryBundle createReadCountQuery(EntityManager em, Class entityClass) {
        QueryBundle q = new QueryBundle(em, entityClass);
        q.query.select(q.builder.count(q.root));
        return q;
    }

    public static QueryBundle createReadMinQuery(EntityManager em, Class entityClass, String col) {
        QueryBundle q = new QueryBundle(em, entityClass);
        q.query.select(q.builder.min(q.root.get(col)));
        return q;
    }

    public static QueryBundle createReadMaxQuery(EntityManager em, Class entityClass, String col) {
        QueryBundle q = new QueryBundle(em, entityClass);
        q.query.select(q.builder.max(q.root.get(col)));
        return q;
    }

    public static QueryBundle createReadAvgQuery(EntityManager em, Class entityClass, String col) {
        QueryBundle q = new QueryBundle(em, entityClass);
        q.query.select(q.builder.avg(q.root.get(col)));
        return q;
    }

    public static QueryBundle createReadSumQuery(EntityManager em, Class entityClass, String col) {
        QueryBundle q = new QueryBundle(em, entityClass);
        q.query.select(q.builder.sum(q.root.get(col)));
        return q;
    }

    public static QueryBundle createReadDistinctQuery(EntityManager em, Class entityClass, String col) {
        QueryBundle q = new QueryBundle(em, entityClass);
        q.query.select(q.root.get(col)).distinct(true);
        return q;
    }

    public CriteriaBuilder getBuilder() {
        return builder;
    }

    public CriteriaQuery getQuery() {
        return query;
    }

    public Root getRoot() {
        return root;
    }

    public Expression getWhere() {
        return where;
    }

    public Query compile() {
        if (where != null) {
            query.where(where);
        }
        if (!orders.isEmpty()) {
            query.orderBy(orders);
        }
        return em.createQuery(query);
    }

    public QueryBundle setFilter(Map filter) {
//        if (filter != null) {
        for (Object key : filter.keySet()) {
            appendFilter(String.valueOf(key), filter.get(key));
        }
//        }
        return this;
    }

    public QueryBundle appendOrder(String path, boolean desc) {
        if (path == null) {
            return this;
        }
        return appendOrder(createPath(path), desc);
    }

    public QueryBundle appendOrder(Path path, boolean desc) {
        Order order = desc ? builder.desc(path) : builder.asc(path);
        if (!orders.contains(order)) {
            orders.add(order);
        }
        return this;
    }

    public QueryBundle appendFilter(String property, Object expr) {
        if (expr instanceof String) {
            try {
                if (((String) expr).isEmpty()) {
                    return this;
                }
                if (((String) expr).equalsIgnoreCase("null")) {
                    return appendIsNullFilter(property);
                }
                if (((String) expr).equalsIgnoreCase("bool__true") || ((String) expr).equalsIgnoreCase("bool__false")) {
                    return appendBoolFilter(property, ((String) expr).equalsIgnoreCase("bool__true"));
                }
                if (property.startsWith("id__")) {
                    return appendEqFilter(property.substring(4), Long.valueOf((String) expr));
                }
            } catch (Exception e) {
                return appendLikeFilter(property, (String) expr);
            }
            return appendLikeFilter(property, (String) expr);
        } else {
//            return appendEqFilter(property, expr);
            if (expr == null) {
                return this;
            }
            return appendEqObjectFilter(property, expr);
        }
    }

    public QueryBundle appendEqFilter(String property, Object expr) {
        return appendEqFilter(property, true, true, expr);
    }

    public QueryBundle appendEqFilter(String property, boolean include, Object expr) {
        return appendEqFilter(property, include, true, expr);
    }

    public QueryBundle appendEqFilter(String property, boolean include, boolean and, Object expr) {
        Path path = createPath(property);
        Expression e = createInPredicate(expr, path);
        if (!include) {
            e = builder.not(e);
        }
        if (where != null) {
            if (and) {
                where = builder.and(where, e);
            } else {
                where = builder.or(where, e);
            }
        } else {
            where = e;
        }
        return this;
    }

    public QueryBundle appendBoolFilter(String property, boolean value) {
        Path path = createPath(property);
        if (where != null) {
            where = builder.and(where, builder.equal(path, value));
        } else {
            where = builder.equal(path, value);
        }
        return this;
    }

    public QueryBundle appendEqObjectFilter(String property, Object value) {
        Path path = createPath(property);
        if (where != null) {
            where = builder.and(where, builder.equal(path, value));
        } else {
            where = builder.equal(path, value);
        }
        return this;
    }

    public QueryBundle appendInArrayFilter(String arrayName, String value) {
        Path path = createPath(arrayName);
        Expression e = builder.like(path, "%" + value + "%");
        if (where != null) {
            where = builder.and(where, e);
        } else {
            where = e;
        }
        return this;
    }

    public QueryBundle appendGtFilter(String property, Long value) {
        Path path = createPath(property);
        if (where != null) {
            where = builder.and(where, builder.gt(path, value));
        } else {
            where = builder.gt(path, value);
        }
        return this;
    }

    public QueryBundle appendLtFilter(String property, Long value) {
        Path path = createPath(property);
        if (where != null) {
            where = builder.and(where, builder.lt(path, value));
        } else {
            where = builder.lt(path, value);
        }
        return this;
    }

    public QueryBundle appendLeFilter(String property, Long value) {
        Path path = createPath(property);
        if (where != null) {
            where = builder.and(where, builder.le(path, value));
        } else {
            where = builder.le(path, value);
        }
        return this;
    }

    public QueryBundle appendBeforeFilter(String property, Date value) {
        Path path = createPath(property);
        if (where != null) {
            where = builder.and(where, builder.lt(path, value.getTime()));
        } else {
            where = builder.lt(path, value.getTime());
        }
        return this;
    }

    public QueryBundle appendScheduledFilter(String property, Date value) {
        Path path = createPath(property);
        if (where != null) {
            where = builder.and(where, builder.or(builder.isNull(path), builder.lt(path, value.getTime())));
        } else {
            where = builder.or(builder.isNull(path), builder.lt(path, value.getTime()));
        }
        Order order = builder.asc(path);
        if (!orders.contains(order)) {
            orders.add(order);
        }
        return this;
    }

    public QueryBundle appendAfterFilter(String property, Date value) {
        Path path = createPath(property);
        if (where != null) {
            where = builder.and(where, builder.gt(path, value.getTime()));
        } else {
            where = builder.gt(path, value.getTime());
        }
        return this;
    }

    public QueryBundle appendIsNullFilter(String property) {
        Path path = createPath(property);
        if (where != null) {
            where = builder.and(where, builder.isNull(path));
        } else {
            where = builder.isNull(path);
        }

        return this;
    }

    public QueryBundle appendIsNotNullFilter(String property) {
        Path path = createPath(property);
        if (where != null) {
            where = builder.and(where, builder.isNotNull(path));
        } else {
            where = builder.isNotNull(path);
        }

        return this;
    }

    public QueryBundle appendBetweenIntFilter(String property, Double from, Double to) {
        if (from == null && to == null) {
            return this;
        }
        Path path = createPath(property);
        if (where != null) {
            if (from == null) {
                where = builder.and(where, builder.lt(path, to));
            } else {
                if (to == null) {
                    where = builder.and(where, builder.gt(path, from));
                } else {
                    where = builder.and(where, builder.between(path, from, to));
                }
            }

        } else {
            if (from == null) {
                where = builder.lt(path, to);
            } else {
                if (to == null) {
                    where = builder.gt(path, from);
                } else {
                    where = builder.between(path, from, to);
                }
            }
        }
        return this;
    }

    public QueryBundle appendBetweenFilter(String property, Date from, Date to) {
        if (from == null && to == null) {
            return this;
        }
        Path path = createPath(property);
        if (where != null) {
            if (from == null) {
                where = builder.and(where, builder.lt(path, to.getTime()));
            } else {
                if (to == null) {
                    where = builder.and(where, builder.gt(path, from.getTime()));
                } else {
                    where = builder.and(where, builder.between(path, from.getTime(), to.getTime()));
                }
            }

        } else {
            if (from == null) {
                where = builder.lt(path, to.getTime());
            } else {
                if (to == null) {
                    where = builder.gt(path, from.getTime());
                } else {
                    where = builder.between(path, from.getTime(), to.getTime());
                }
            }
        }
        return this;
    }

    public QueryBundle appendLikeFilter(String property, String expr) {
        return appendLikeFilter(property, true, true, expr);
    }

    public QueryBundle appendLikeFilter(String property, boolean include, String expr) {
        return appendLikeFilter(property, include, true, expr);
    }

    public QueryBundle appendLikeFilter(String property, boolean include, boolean and, String expr) {
        Path path = createPath(property);
        Expression e = builder.like(path, "%" + expr + "%");
        if (!include) {
            e = builder.not(e);
        }
        if (where != null) {
            if (and) {
                where = builder.and(where, e);
            } else {
                where = builder.or(where, e);
            }
        } else {
            where = e;
        }
        return this;
    }

    public QueryBundle appendStartsWithFilter(String property, String expr, boolean include) {
        Path path = createPath(property);
        Expression e = builder.like(path, expr + "%");
        if (!include) {
            e = builder.not(e);
        }
        if (where != null) {
            where = builder.and(where, e);
        } else {
            where = e;
        }
        return this;
    }

    public QueryBundle appendStartsWithOrEqFilter(String property, String startsWith, String eq) {
        Path path = createPath(property);
        Expression e1 = builder.like(path, startsWith + "%");
        Expression e2 = builder.like(path, eq);
        if (where != null) {
            where = builder.and(where, builder.or(e1, e2));
        } else {
            where = builder.or(e1, e2);
        }
        return this;
    }

    Path createPath(String path) {
        Path result = root;
        for (String sub : path.split("\\.")) {
            result = result.get(sub);
        }
        return result;
    }

    public static Predicate createInPredicate(Object value, Path path) {
        if (value instanceof Collection) {
            return path.in((Collection) value);
        } else if (value instanceof Object[]) {
            return path.in((Object[]) value);
        } else {
            return path.in(value);
        }
    }
}
