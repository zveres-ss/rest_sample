package ua.lviv.iot.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ua.lviv.iot.model.Student;

public class StudentDaoImpl extends AbstractDao<Student> {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Student> getEntityClass() {
        return Student.class;
    }

    //@Resource
    //private UserTransaction userTransaction;

}
