package com.jurineide.teste.controllers;

import com.jurineide.teste.dtos.AutomovelDTO;
import com.jurineide.teste.services.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutomovelController {

    @Autowired
    AutomovelService automovelService;

    @PostMapping("/postAutomoveis")
    public ResponseEntity<AutomovelDTO>saveAutomovel(@RequestBody AutomovelDTO automovelDTO) {
        return ResponseEntity.ok(automovelService.save(automovelDTO));
    }




    @GetMapping("/getAllAutomoveis")
    public List<AutomovelDTO> findAll(){
        var response = automovelService.findAll();
        return  response;
    }
}
