package com.jurineide.teste.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutomovelDTO {

    public Long id;
    public String marca;
    public String modelo;
    public Double valor;
    public String dataCadastro;
}
