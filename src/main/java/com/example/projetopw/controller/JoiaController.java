package com.example.projetopw.controller;

import com.example.projetopw.service.JoiaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoiaController {
    JoiaService service;

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("mensagem", "Hello World");
        return "home";
    }
}