package com.jurineide.teste.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AutomovelReponseDTO {
    public String marca;
    public String modelo;
    public Double valor;
    public String dataCadastro;

}
