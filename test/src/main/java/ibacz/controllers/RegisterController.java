/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibacz.controllers;

import ibacz.pojo.Student;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Kristian Mateka
 */
@Controller
@RequestMapping(value = "/register")
public class RegisterController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(ModelMap model) {
        Student studentForm = new Student(); 
        model.put("studentForm", studentForm);
         
        return "StudentRegistration";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("studentForm") Student student,
            Map<String, Object> model) {
         
        // implement your own registration logic here...
         
        // for testing purpose:
        System.out.println("username: " + student.getName());
        System.out.println("surname: " + student.getSurname());
        System.out.println("birth date: " + student.getBirth());
        System.out.println("gender: " + student.getGender());
         
        return "RegistrationSuccess";
    }
}
