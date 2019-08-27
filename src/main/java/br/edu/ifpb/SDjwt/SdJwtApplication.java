package br.edu.ifpb.SDjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SdJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdJwtApplication.class, args);
	}
	@RequestMapping("/home")
	public String hello(){
		return "Coe!";
	}

}
