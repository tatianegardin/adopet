package br.alura.adopet.repository;

import br.alura.adopet.model.UsuarioAdopet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepo extends CrudRepository<UsuarioAdopet, Long> {
}
