package com.spring.cep.services;

import com.spring.cep.model.Cep;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {
    public static Cep run(String cepUSer){
        return  new RestTemplate().getForEntity("https://viacep.com.br/ws/"+cepUSer+"/json/", Cep.class).getBody();
    }
}