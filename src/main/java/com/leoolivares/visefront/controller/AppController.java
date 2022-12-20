package com.leoolivares.visefront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AppController {
    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/detalle/{id}")
    public String detalle(@PathVariable("id") Integer id){

        System.out.println(id);
        return "detalle";
    }
    @GetMapping("/inve")
    public String detalle(){

        return "inventario";
    }
}
