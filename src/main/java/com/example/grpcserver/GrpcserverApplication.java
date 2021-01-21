package com.example.grpcserver;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class GrpcserverApplication {

    @Value("${NAME:World}")
    String name;

    @RestController
    class HelloworldController {
        @GetMapping("/")
        String hello() {
            return "Hello " + name + "!";
        }
    }


    public static void main(String[] args) {

        SpringApplication.run(GrpcserverApplication.class, args);

        Server server = ServerBuilder
                .forPort(8030)
                .addService(new ServiceImpl()).build();

        try {
            server.start();
            System.out.println("grpc custom Server started at port 8030");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
