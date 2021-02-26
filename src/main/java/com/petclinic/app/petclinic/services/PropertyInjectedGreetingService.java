package com.petclinic.app.petclinic.services;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Hello world - Property";
    }
}
