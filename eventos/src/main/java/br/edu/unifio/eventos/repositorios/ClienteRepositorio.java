package br.edu.unifio.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.eventos.entidades.Cliente1;

public interface ClienteRepositorio extends JpaRepository<Cliente1, Integer> {

}