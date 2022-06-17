package com.devmelo.hroficina.controller;

import com.devmelo.hroficina.domain.Oficina;
import com.devmelo.hroficina.repositroy.OficinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/oficinas")
public class OficinaController {

    @Autowired
    private OficinaRepository repository;

    @GetMapping
    public ResponseEntity<List<Oficina>> findAll(){
        List<Oficina> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{cnpj}")
    public ResponseEntity<Oficina> consultarOficinaCnpj(@PathVariable Long cnpj){
        Oficina oficina = repository.findByCnpj(cnpj).get();
        return ResponseEntity.ok(oficina);
    }
}
