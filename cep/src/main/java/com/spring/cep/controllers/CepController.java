package com.spring.cep.controllers;

import com.spring.cep.Cep;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CepController {


    @GetMapping("/cep/{cep}")
    public ResponseEntity<Cep> hello(@PathVariable("cep") String cepUser) throws Exception {

      Cep cep = run(cepUser);
      return new ResponseEntity<>(cep, HttpStatus.OK);
    }

    public Cep run(String cepUSer) throws Exception{
        return  new RestTemplate().getForEntity("https://viacep.com.br/ws/"+cepUSer+"/json/", Cep.class).getBody();
    }
}
