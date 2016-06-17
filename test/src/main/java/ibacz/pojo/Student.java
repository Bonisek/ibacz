/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibacz.pojo;

import ibacz.common.Enums.Gender;
import java.time.LocalDate;
import java.util.Date;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Kristian Mateka
 */
public class Student {
    
    @Size(message = "Field name must be in range 1 - 50", min = 1, max = 50)
    @Pattern(message = "Field name can contain only letters", regexp = "[a-zA-Z]+")
    private String name;
    
    @Size(message = "Field surname must be in range 1 - 50", min = 1, max = 50)
    @Pattern(message = "Field surname can contain only letters", regexp = "[a-zA-Z]+")
    private String surname;
    
    @DateTimeFormat(pattern = "dd.MM.yyyy")
//    @Past
    private Date birth;
    
    private Gender gender;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
