package com.test.javajam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String goHome(){
        return "home.html";
    }
    @GetMapping("/menu")
    public String goMenu(){
        return "menu.html";
    }
    @GetMapping("/music")
    public String goMusic(){
        return "music.html";
    }
    @GetMapping("/jobs")
    public String goJobs(){
        return "jobs.html";
    }
    @GetMapping("/gear")
    public String goGear(){
        return "gear.html";
    }

}
