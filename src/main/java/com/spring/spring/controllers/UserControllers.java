package com.spring.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.spring.models.User;

@Controller
public class UserControllers {
    @GetMapping("/index")
    public String perfile(Model model){
        User user = new User("Andryk", "Trujillo Chama", "zs23004743@hotmail.com", "2712542342", "Luis sanchez av.3");
        model.addAttribute("user", user);
        //model.addAttribute("Nombre", "Andryk Giovany");
        //model.addAttribute("Apellidos", "Trujillo Chama");
       // model.addAttribute("Telefono", "271 245 2429");
        //model.addAttribute("Edad", "19");
        //model.addAttribute("Direccion", "Luis Sanchez, av.3");
    
        
        return "index.html";
    
    }
}
