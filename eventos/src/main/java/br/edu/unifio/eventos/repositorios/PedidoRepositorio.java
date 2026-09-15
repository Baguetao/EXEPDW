package br.edu.unifio.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.eventos.entidades.Pedido1;

public interface PedidoRepositorio extends JpaRepository<Pedido1, Integer> {

}