package br.alura.adopet.service;

import br.alura.adopet.model.DtoMensagem;
import br.alura.adopet.model.UsuarioAdopet;

public interface IUsuarioService {
    UsuarioAdopet cadastrarUsuario(UsuarioAdopet usuario);
    UsuarioAdopet buscarUsuario(long id);
    DtoMensagem deletarMensagem(long id);
}
