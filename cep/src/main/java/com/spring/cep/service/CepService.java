package com.spring.cep.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.cep.model.Cep;

@Service
public class CepService {
    public Cep run(String cepUSer){
        return  new RestTemplate().getForEntity("https://viacep.com.br/ws/"+cepUSer+"/json/", Cep.class).getBody();
    }
}