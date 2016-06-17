/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.dao;

import com.mysql.cj.api.Session;
import ibacz.model.Student;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import javax.management.Query;
import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Kristian Mateka
 */
public class studentDaoImpl extends HibernateDaoSupport implements studentDao {

    @Override
    public void createStudent(Student student) {
        getHibernateTemplate().save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        getHibernateTemplate().delete(student);
    }

    @Override
    public void editStudent(Student student) {
        getHibernateTemplate().update(student);
    }

    @Override
    public Collection<Student> getStudents() {
        return getHibernateTemplate().executeFind(new HibernateCallback() {
            @Override
            public Object doInHibernate(org.hibernate.Session session) throws HibernateException, SQLException {
                org.hibernate.Query q = session.createQuery("from Student");
                return q.list();
            }
        });
    }
}
