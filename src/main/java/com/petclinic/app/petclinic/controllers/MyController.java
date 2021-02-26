package com.petclinic.app.petclinic.controllers;

import com.petclinic.app.petclinic.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController  {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello()
    {
        return greetingService.sayGreetings();
    }

}
