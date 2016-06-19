/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibacz.controllers;

import ibacz.models.Student;
import ibacz.service.StudentServiceImpl;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Kristian Mateka
 */
@Controller
public class HomeController {
    
    private final StudentServiceImpl manager = new StudentServiceImpl();
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        return "index";
    }
    
    @RequestMapping(value = "/DatePicker", method = RequestMethod.GET)
    public String datePicker(ModelMap map) {
        return "DatePicker";
    }
    
    @RequestMapping(value = "/Validator", method = RequestMethod.GET)
    public String validator(ModelMap map) {
        return "Validator";
    }
    
    @RequestMapping(value = "/help", method = RequestMethod.GET)
    public String viewRegistration(ModelMap model) {
        model.addAttribute("student", new Student());
         
        return "studentHelp";
    }
     
    @RequestMapping(value = "/help", method = RequestMethod.POST)
    public String processRegistration(@Valid Student student, BindingResult result) {
        if(result.hasErrors()){
            return "studentHelp";
        }else{
            manager.createStudent(student);
            return "redirect:/student/index";
        }
    }
}
