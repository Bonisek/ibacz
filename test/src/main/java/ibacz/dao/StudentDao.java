/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibacz.dao;

import ibacz.models.Student;
import java.util.Collection;

/**
 *
 * @author Kristian Mateka
 */
public interface StudentDao {
    void createStudent(Student student);
    void deleteStudent(Student student);
    void editStudent(Student student);
    Student getStudent(int id);
    Collection<Student> getStudents();
}
