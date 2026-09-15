package br.edu.unifio.eventos.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.eventos.entidades.Cliente1;
import br.edu.unifio.eventos.entidades.Pedido1;

@SpringBootTest
public class PedidoRepositorioTests {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Test
    public void SavePedidoNovo() {

        var pedido = new Pedido1();

        pedido.setData(LocalDateTime.now());
        pedido.setStatus("FECHADO");
        pedido.setValorTotal(new BigDecimal("302.00"));

        var cliente = clienteRepositorio.findById(1).orElseThrow();
        pedido.setCliente1(cliente);

        pedidoRepositorio.save(pedido);

        assertNotNull(pedido.getId());
    }
}