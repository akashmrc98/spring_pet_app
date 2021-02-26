package com.petclinic.app.petclinic.controllers;

import com.petclinic.app.petclinic.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class setterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedGreetingService());
    }


    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}