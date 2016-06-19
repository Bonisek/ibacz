/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibacz.models;

import ibacz.common.Enums.Gender;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Kristian Mateka
 */
@Entity
@Table(name = "PERSON")
public class Student implements Serializable  {
    
    private static final long serialVersionUID = -5527566248002296042L;
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "NAME")
    @Size(message = "Field name must be in range 1 - 50", min = 1, max = 50)
    @Pattern(message = "Field name can contain only letters", regexp = "[a-zA-Z]+")
    private String name;
    
    @Column(name = "SURNAME")
    @Size(message = "Field surname must be in range 1 - 50", min = 1, max = 50)
    @Pattern(message = "Field surname can contain only letters", regexp = "[a-zA-Z]+")
    private String surname;
    
    @Column(name = "BIRTH")
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @Temporal(javax.persistence.TemporalType.DATE)
    @Past
    private Date birth;
    
    @Column(name = "GENDER")
    private Gender gender;

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
