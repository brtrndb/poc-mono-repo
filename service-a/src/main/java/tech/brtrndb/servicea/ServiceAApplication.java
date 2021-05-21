package tech.brtrndb.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tech.brtrndb.librarya.ObjectA;

@SpringBootApplication
public class ServiceAApplication {

    public static void main(String[] args) {
        ObjectA a = new ObjectA();
        SpringApplication.run(ServiceAApplication.class, args);
    }

}
