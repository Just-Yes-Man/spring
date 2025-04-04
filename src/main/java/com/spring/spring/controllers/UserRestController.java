package com.spring.spring.controllers;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class UserRestController {

  
    @GetMapping("/index")
    public Map<String,Object> perfile(){
         
        Map<String, Object> body = new HashMap<>();

        body.put("titulo", "Pradera Boot");
        body.put("Nombre", "Andryk Giovany");
        body.put("Apellidos", "Trujillo Chama");
        body.put("Telefono", "271 245 2429");
        body.put("Edad", "19");
        body.put("Direccion", "Luis Sanchez, av.3");
        
        return body;
    
    }
}
