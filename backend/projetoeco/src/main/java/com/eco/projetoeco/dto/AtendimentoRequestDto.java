package com.eco.projetoeco.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AtendimentoRequestDto {

    @NotNull(message = "Data de atendimento é obrigatória")
    private LocalDate dataAtendimento;

    @NotNull(message = "Código do funcionário é obrigatório")
    private String funcionarioCodigo;

    @NotNull(message = "ID da denúncia é obrigatório")
    private Long denunciaId;
}
