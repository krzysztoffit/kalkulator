package com.kodilla.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {
//        SpringApplication.run(KalkulatorApplication.class, args);
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(5, 7));
        System.out.println(calculator.subtraction(7, 5));
    }

}
