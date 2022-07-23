package br.alura.adopet.service;

import br.alura.adopet.exception.NotFoundException;
import br.alura.adopet.model.DtoMensagem;
import br.alura.adopet.model.UsuarioAdopet;
import br.alura.adopet.repository.IUsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private IUsuarioRepo repo;

    @Override
    public UsuarioAdopet cadastrarUsuario(UsuarioAdopet usuario) {
        return repo.save(usuario);
    }

    @Override
    public UsuarioAdopet buscarUsuario(long id) {
        return repo.findById(id).get();
    }

    @Override
    public DtoMensagem deletarMensagem(long id) {
        return null;
    }


}
