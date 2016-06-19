/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibacz.dao;

import ibacz.models.Student;
import java.util.Collection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Kristian Mateka
 */
public class StudentDaoImpl implements StudentDao{
    
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
    }
    
    @Override
    public void createStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.update(student);
    }

    @Override
    public void deleteStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(student);
    }

    @Override
    public void editStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(student);
    }

    @Override
    public Student getStudent(int id) {
        Session session = sessionFactory.getCurrentSession();
        return (Student) session.load(Student.class, id);
    }

    @Override
    public Collection<Student> getStudents() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Student").list();
    }
}
