/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibacz.controllers;

import ibacz.model.Student;
import ibacz.service.StudentServiceImpl;
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
@RequestMapping(value = "/student")
public class StudentController {
    
    private final StudentServiceImpl manager = new StudentServiceImpl();
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap model) {
        
        model.addAttribute("list", manager.getStudents());
        
        return "studentIndex";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String viewRegistration(ModelMap model) {
        model.addAttribute("student", new Student());
         
        return "StudentRegistration";
    }
     
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(@Valid Student student, BindingResult result) {
        if(result.hasErrors()){
            return "StudentRegistration";
        }else{
            manager.createStudent(student);
            return "redirect:/student/index";
        }
    }
    
    @InitBinder     
    public void initBinder(WebDataBinder binder){
         binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd.MM.yyyy"), true));   
    }
}
