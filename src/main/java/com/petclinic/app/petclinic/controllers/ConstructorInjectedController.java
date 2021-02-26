package com.petclinic.app.petclinic.controllers;
import com.petclinic.app.petclinic.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
// recommend one

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings()
    {
        return greetingService.sayGreetings();
    }
}
