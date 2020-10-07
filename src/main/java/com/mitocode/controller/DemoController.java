package com.mitocode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
    @GetMapping("/saludo")
    //En este caso la URL es http://localhost:8080/saludo
    public String greeting(@RequestParam(name="nombreDelTipo", required=false, defaultValue="World") String name, Model model) {
        //La URL para usar un nombre es http://localhost:8080/saludo?nombreDelTipo=Peru por ejemplo
        model.addAttribute("nombrecito", name);
        return "greeting";
        //Ese greeting del return hace mencion al nombre del HTML


        //Si tira el error de que el puerto 8080 esta ocupado aca esta la solucion
        //netstat -ao | find "8080"
        //Ahi te fijas que numero es, por ejemplo 6988
        //Taskkill /PID  6988 /F
    }
}
