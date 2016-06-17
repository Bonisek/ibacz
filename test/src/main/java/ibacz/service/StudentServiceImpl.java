/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibacz.service;

import ibacz.pojo.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kristian Mateka
 */
public class StudentServiceImpl implements StudentService{
    
    private final List<Student> list;

    public StudentServiceImpl() {
        list = new ArrayList<>();
    }

    public List<Student> getList() {
        return Collections.unmodifiableList(list);
    }
    
    @Override
    public void createStudent(Student student) {
        list.add(student);
    }

    @Override
    public void deleteStudent(Student student) {
        if(!list.remove(student)){
            // 
        }
    }

    @Override
    public void editStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Student> getStudents() {
        return getList();
    }
    
}
