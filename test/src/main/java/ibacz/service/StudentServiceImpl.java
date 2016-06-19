/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibacz.service;

import ibacz.dao.StudentDao;
import ibacz.models.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kristian Mateka
 */
public class StudentServiceImpl implements StudentService{
    
    // list was non-db entity holder
    private final List<Student> list;
    
    private StudentDao StudentDao;

    public void setStudentDao(StudentDao StudentDao) {
        this.StudentDao = StudentDao;
    }

    public StudentServiceImpl() {
        list = new ArrayList<>();
    }

    public List<Student> getList() {
        return Collections.unmodifiableList(list);
    }
    
    @Override
    public void createStudent(Student student) {
        student.setId(list.size());
        list.add(student);
        
        // StudentDao.createStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
        Student student = list.get(id);
        if(!list.remove(student)){
            // 
        }
        // student = StudentDao.getStudent(id);
        // StudentDao.deleteStudent(student);
    }

    @Override
    public void editStudent(Student student) {
        Student s = list.get(student.getId());
        
        s.setName(student.getName());
        s.setSurname(student.getSurname());
        s.setBirth(student.getBirth());
        s.setGender(student.getGender());
        
        list.add(student.getId(), s);
        // StudentDao.editStudent(student);
    }

    @Override
    public Collection<Student> getStudents() {
        return getList();
        // return StudentDao.getStudents()
    }

    @Override
    public Student getStudent(int id) {
        if(id < list.size()){
            return list.get(id);
        }
        
        return null;
        
        // return StudentDao.getStudent(id);
    }
    
}
