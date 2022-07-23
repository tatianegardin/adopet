package br.alura.adopet.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DtoMensagem {
    private String mensagem;
}
