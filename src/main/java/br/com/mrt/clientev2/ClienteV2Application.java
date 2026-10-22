package br.com.mrt.clientev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/home")
@RestController
public class ClienteV2Application {

    @GetMapping("/java")
    @ResponseStatus(HttpStatus.OK)
    public String javaHome() {
        return "JAVA HOME - APP ON";
    }


    public static void main(String[] args) {
        SpringApplication.run(ClienteV2Application.class, args);
    }

}
