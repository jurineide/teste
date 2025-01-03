package com.jurineide.teste.services;


import com.jurineide.teste.dtos.AutomovelDTO;
import com.jurineide.teste.dtos.AutomovelReponseDTO;
import com.jurineide.teste.entities.Automovel;
import com.jurineide.teste.repositories.AutomovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class AutomovelService {

    @Autowired
    AutomovelRepository automovelRepository;

    public AutomovelDTO save(AutomovelDTO automovelDTO) {
        Automovel automovel = new Automovel(
                automovelDTO.getId(),
                automovelDTO.getMarca(),
                automovelDTO.getModelo(),
                automovelDTO.getValor(),
                automovelDTO.getDataCadastro());

        Automovel saveAutomovel = automovelRepository.save(automovel);


        return new AutomovelDTO(automovel.getId(),
                saveAutomovel.getMarca(),
                saveAutomovel.getModelo(),
                saveAutomovel.getValor(),
                saveAutomovel.getDataCadastro());
    }

    public List<AutomovelReponseDTO> findAll() {

        List<Automovel> automovels = automovelRepository.findAll();


        return automovels.stream().map(automovel -> new AutomovelReponseDTO(
                automovel.getMarca(),
                automovel.getModelo(),
                automovel.getValor(),
                automovel.getDataCadastro() )).collect(Collectors.toList());
    }

    public Optional<AutomovelReponseDTO> finById(Long id){

        return automovelRepository.findById(id).map(automovel ->  new AutomovelReponseDTO(
                automovel.getMarca(),
                automovel.getModelo(),
                automovel.getValor(),
                automovel.getDataCadastro())
        );
    }
}