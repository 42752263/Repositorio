package com.prueba.Prueba;

import com.prueba.Prueba.Modelos.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class PruebaApplication {
	@GetMapping("/Hola")public String hola() {
        return "Si veo el mensaje estamos bien, sino paila";
    }

	@GetMapping("/test")
	public String test() {
		Empresa emp = new Empresa("Modas 2000", "La Estrella", "123", "13398");
		return emp.getNombre();

	}

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

}
