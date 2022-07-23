package br.alura.adopet.handler;

import br.alura.adopet.exception.ExceptionDetalhes;
import br.alura.adopet.exception.NotFoundException;
import br.alura.adopet.exception.UsuarioExistenteException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class MyExceptionHandler {

   @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDetalhes> NotFoundException(NotFoundException ex){
        return new ResponseEntity<>( ExceptionDetalhes.builder()
                .data(LocalDateTime.now())
                .mensagem(ex.getMessage())
                .titulo("Erro do usuário!")
                .status(HttpStatus.NOT_FOUND.value())
                .build(),
                HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UsuarioExistenteException.class)
    public ResponseEntity<ExceptionDetalhes> UsuarioExistenteException(UsuarioExistenteException ex){
        return new ResponseEntity<>( ExceptionDetalhes.builder()
                .data(LocalDateTime.now())
                .mensagem(ex.getMessage())
                .titulo("Erro na requisição")
                .status(HttpStatus.BAD_REQUEST.value())
                .build(),
                HttpStatus.BAD_REQUEST);
    }

}
