package com.petclinic.app.petclinic;

import com.petclinic.app.petclinic.controllers.ConstructorInjectedController;
import com.petclinic.app.petclinic.controllers.MyController;
import com.petclinic.app.petclinic.controllers.PropertyInjectedController;
import com.petclinic.app.petclinic.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PetClinicApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(PetClinicApplication.class, args);
		MyController myController = (MyController) context.getBean("myController");
		String greetings = myController.sayHello();

		System.out.println("------------- Primary Bean");
		System.out.println(greetings);

		System.out.println("------------- Property");
		PropertyInjectedController propertyInjectController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectController.getGreetings());

		System.out.println("------------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetings());

		System.out.println("------------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());
	}

}
