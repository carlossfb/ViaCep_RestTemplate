package com.spring.cep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CepApplication {

	/*Acionando o log para uso como registrador FINS DE TESTE
	private static final Logger log = LoggerFactory.getLogger(CepApplication.class);
	*/

	public static void main(String[] args) {
		SpringApplication.run(CepApplication.class, args);
	}
}
