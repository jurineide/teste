package com.jurineide.teste.controllers;

import com.jurineide.teste.dtos.AutomovelDTO;
import com.jurineide.teste.dtos.AutomovelReponseDTO;
import com.jurineide.teste.services.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AutomovelController {

    @Autowired
    AutomovelService automovelService;

    @PostMapping("/postAutomoveis")
    public ResponseEntity<AutomovelDTO>saveAutomovel(@RequestBody AutomovelDTO automovel) {
        return ResponseEntity.ok(automovelService.save(automovel));
    }




    @GetMapping("/getAllAutomoveis")
    public List<AutomovelReponseDTO> findAll(){
        var response = automovelService.findAll();
        return  response;
    }

    @GetMapping("/getbyId/{id}")
    public Optional<AutomovelReponseDTO> findById(@PathVariable Long id) {
        var response = automovelService.finById(id);
        return  response;

    }
}
