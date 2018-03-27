package ua.lviv.iot.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDao<T> {

        @PersistenceContext
        private EntityManager entityManager;
    
        public void setEntityManager(EntityManager entityManager) {
            this.entityManager = entityManager;
        }

    protected abstract Class<T> getEntityClass();

    public T findById(Integer id) {
        entityManager.getTransaction().begin();
        T result = (T) entityManager.find(getEntityClass(), id);
        entityManager.getTransaction().commit();
        return result;
    }

    public T persist(T object) {
        entityManager.getTransaction().begin();
        entityManager.persist(object);
        entityManager.getTransaction().commit();
        return object;
    }

}
