package ua.lviv.iot.persistence.dao;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ua.lviv.iot.model.Student;

@Named
@Dependent
public class StudentDaoImpl extends AbstractDao<Student> implements StudentDao, Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Student> getEntityClass() {
        return Student.class;
    }

    //@Resource
    //private UserTransaction userTransaction;
    
    @PostConstruct
    public void init() {
        System.out.println("ready");
    }

}
