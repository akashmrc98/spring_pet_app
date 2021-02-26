package com.petclinic.app.petclinic.controllers;

import com.petclinic.app.petclinic.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    public GreetingService greetingService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String getGreetings()
    {
        return greetingService.sayGreetings();
    }


}
