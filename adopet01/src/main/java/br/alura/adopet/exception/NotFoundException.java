package br.alura.adopet.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
@NoArgsConstructor
@ResponseStatus(HttpStatus.NOT_FOUND)

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
