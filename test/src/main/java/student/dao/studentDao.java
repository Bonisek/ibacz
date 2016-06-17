/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.dao;

import ibacz.model.Student;
import java.util.Collection;

/**
 *
 * @author Kristian Mateka
 */
public interface studentDao {
    void createStudent(Student student);
    void deleteStudent(Student student);
    void editStudent(Student student);
    Collection<Student> getStudents();
}
