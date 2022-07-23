package br.alura.adopet.controller;


import br.alura.adopet.model.DtoMensagem;

import br.alura.adopet.model.UsuarioAdopet;
import br.alura.adopet.service.IUsuarioService;
import br.alura.adopet.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1/adopet")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<UsuarioAdopet> salvarUsuario(@RequestBody UsuarioAdopet usuario){
        return ResponseEntity.ok(service.cadastrarUsuario(usuario));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioAdopet> buscarUsuario(@PathVariable long id){
        return ResponseEntity.ok(service.buscarUsuario(id));
    }


    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<DtoMensagem> deletarUsuario(@PathVariable long id){
        return ResponseEntity.ok(service.deletarUsuario(id));
    }

}
