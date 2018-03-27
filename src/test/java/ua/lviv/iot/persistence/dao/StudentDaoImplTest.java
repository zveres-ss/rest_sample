package ua.lviv.iot.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.model.Student;

class StudentDaoImplTest {

    @Test
    public void testManager() {
        EntityManager em2 = Persistence.createEntityManagerFactory("test_manager").createEntityManager();
        StudentDaoImpl daoImpl = new StudentDaoImpl();
        daoImpl.setEntityManager(em2);
        daoImpl.persist(new Student("vassa", "masa"));
        daoImpl.findById(1);
        daoImpl.findById(2);
        daoImpl.findById(3);
    }

}
