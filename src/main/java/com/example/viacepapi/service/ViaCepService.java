package com.example.viacepapi.service;

import com.example.viacepapi.model.ViaCepModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface ViaCepService {
    @GetMapping("{cep}/json")
    ViaCepModel buscaEnderecoPorCep(@PathVariable("cep") String cep);

}