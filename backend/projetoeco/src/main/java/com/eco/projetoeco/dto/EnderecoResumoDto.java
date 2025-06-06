package com.eco.projetoeco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoResumoDto {
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;
}
