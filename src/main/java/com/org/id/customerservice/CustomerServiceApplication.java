package com.org.id.customerservice;

import com.org.id.customerservice.entities.Customer;
import com.org.id.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

        @Bean
        CommandLineRunner start(CustomerRepository customerRepository){
            return args ->{
                customerRepository.save(new Customer(null,"achille","achille@gmail.com"));
                customerRepository.save(new Customer (null,"junior","junior@gmail.com"));
                customerRepository.save(new Customer (null,"joel","joel@gmail.com"));
                customerRepository.save(new Customer (null,"franc","franc@gmail.com"));
                customerRepository.findAll().forEach(System.out::println);
            };
        }
    }


