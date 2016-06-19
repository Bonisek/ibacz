/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentServiceTest;

import ibacz.common.Enums;
import ibacz.models.Student;
import ibacz.service.StudentService;
import ibacz.service.StudentServiceImpl;
import java.time.Instant;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kristian Mateka
 */
public class StudentServiceTest {

    private static StudentService service;

    public StudentServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        service = new StudentServiceImpl();

    }

    @After
    public void tearDown() {
    }

    @Test
    public void emptyList() {
        assertEquals(0, service.getStudents().size());
    }

    @Test
    public void createStudent() {
        Student student = new Student();

        student.setName("ahoj");
        student.setSurname("jo");

        service.createStudent(student);

        assertEquals(1, service.getStudents().size());
        assertEquals(student.getId(), service.getStudent(0).getId());
        assertEquals(student.getName(), service.getStudent(0).getName());
        assertEquals(student.getSurname(), service.getStudent(0).getSurname());
    }

    @Test
    public void deleteStudent() {
        Student student = new Student();

        student.setName("ahoj");
        student.setSurname("jo");

        service.createStudent(student);

        assertEquals(1, service.getStudents().size());
        assertEquals(student.getId(), service.getStudent(0).getId());
        assertEquals(student.getName(), service.getStudent(0).getName());
        assertEquals(student.getSurname(), service.getStudent(0).getSurname());

        service.deleteStudent(student.getId());

        assertEquals(0, service.getStudents().size());
    }

    @Test
    public void getStudent() {
        Student student = new Student();

        student.setName("ahoj");
        student.setSurname("jo");

        service.createStudent(student);

        Student studentGet = service.getStudent(0);
        
        assertEquals(student.getId(), studentGet.getId());
        assertEquals(student.getName(), studentGet.getName());
        assertEquals(student.getSurname(), studentGet.getSurname());
    }
    
    @Test
    public void editStudent() {
        Student student = new Student();

        student.setName("ahoj");
        student.setSurname("jo");
        student.setGender(Enums.Gender.MALE);
        student.setBirth(new Date(1200));

        service.createStudent(student);
        
        Student editStudent = new Student();

        editStudent.setId(0);
        editStudent.setName("omg");
        editStudent.setSurname("geez");
        editStudent.setGender(Enums.Gender.FEMALE);
        editStudent.setBirth(new Date(1500));
        
        service.editStudent(editStudent);
        
        assertEquals(student.getId(), editStudent.getId());
        assertEquals(student.getName(), editStudent.getName());
        assertEquals(student.getSurname(), editStudent.getSurname());
        assertEquals(student.getBirth(), editStudent.getBirth());
        assertEquals(student.getGender(), editStudent.getGender());
    }
}
