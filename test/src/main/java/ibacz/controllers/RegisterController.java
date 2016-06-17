/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibacz.controllers;

import ibacz.pojo.Student;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
        model.addAttribute("student", new Student());
         
        return "StudentRegistration";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@Valid Student student, BindingResult result) {
         
        // implement your own registration logic here...
        
        if(result.hasErrors()){
            return "StudentRegistration";
        }else{
            return "RegistrationSuccess";
        }
    }
    
    @InitBinder     
    public void initBinder(WebDataBinder binder){
         binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd.MM.yyyy"), true));   
    }
}
