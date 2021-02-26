package com.petclinic.app.petclinic.controllers;

import com.petclinic.app.petclinic.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp()
    {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorInjectedGreetingService();
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}