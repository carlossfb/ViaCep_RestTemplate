package com.spring.cep.controller;

import com.spring.cep.Cep;
import com.spring.cep.service.CepService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepController {

  @Autowired
  CepService cepService;

    @GetMapping("/cep/{cep}")
    public ResponseEntity<Cep> hello(@PathVariable("cep") String cepUser){

      Cep cep = cepService.run(cepUser);
      return ResponseEntity.ok(cep);
    }

}
