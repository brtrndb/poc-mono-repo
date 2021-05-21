package tech.brtrndb.serviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tech.brtrndb.libraryb.ObjectB;

@SpringBootApplication
public class ServiceBApplication {

    public static void main(String[] args) {
        ObjectB b = new ObjectB();
        SpringApplication.run(ServiceBApplication.class, args);
    }

}
