package com.kodilla.kodillapatterns2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class KodillaPatterns2Application {

    public static void main(String[] args) {
        SpringApplication.run(KodillaPatterns2Application.class, args);
    }

}
