package com.shamaProject.purchaseTransaction.suppliers;

import com.shamaProject.purchaseTransaction.repository.SuppRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args)    {

        SpringApplication.run(DemoAppApplication.class, args);
	}
    @Bean
    CommandLineRunner CommandLineRunner(SuppRepo supRepo){
        return  args -> {
            Suppliers mohammed=new Suppliers("12334","mohammed","kemal","jemal");
            supRepo.save(mohammed);
        };
    }
        }
