package br.alura.adopet.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExceptionDetalhes {
    private String titulo;
    private String mensagem;
    private int status;
    private LocalDateTime data;

}
