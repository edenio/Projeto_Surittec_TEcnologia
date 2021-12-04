package com.surittec.CadCliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CadClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadClienteApplication.class, args);
		System.out.print(new BCryptPasswordEncoder().encode("123"));
	}

}
