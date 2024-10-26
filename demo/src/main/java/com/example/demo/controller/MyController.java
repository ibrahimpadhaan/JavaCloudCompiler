package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/submit")
    public String result(@RequestParam("code") String code, Model model) {
        model.addAttribute("code", code);
        return "result";
    }
}