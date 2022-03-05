package com.example.viacepapi.controller;

import com.example.viacepapi.model.ViaCepModel;
import com.example.viacepapi.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViaCepController {
    @Autowired
    private ViaCepService cepService;

    @GetMapping("/{cep}")
    public ResponseEntity<ViaCepModel> getCep(@PathVariable String cep) {

        ViaCepModel endereco = cepService.buscaEnderecoPorCep(cep);

        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
    }
}
