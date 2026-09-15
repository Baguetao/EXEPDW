package br.edu.unifio.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.eventos.entidades.Pagamento1;

public interface PagamentoRepositorio extends JpaRepository<Pagamento1, Integer> {

}