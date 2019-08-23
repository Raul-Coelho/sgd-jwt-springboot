/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sgd.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Raul-Coelho
 */

@SpringBootApplication
@RestController
public class JwtmeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtmeApplication.class, args);
    }

    @RequestMapping("/home")
    public String hello() {
        return "Coe Funciona!??";
    }
}
