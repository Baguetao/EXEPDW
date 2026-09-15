package br.edu.unifio.eventos.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.eventos.entidades.Cliente1;
import br.edu.unifio.eventos.entidades.ItemPedido1;
import br.edu.unifio.eventos.entidades.Pedido1;

@SpringBootTest
public class ItemPedidoRepositorioTests {

    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    public void SaveItemPedidoNovo() {

        var cliente = new Cliente1();

        cliente.setNome("João Silvio");
        cliente.setEmail("JotaSao@email.com");
        cliente.setTelefone("999111221");

        clienteRepositorio.save(cliente);


        var pedido = new Pedido1();

        pedido.setData(LocalDateTime.now());
        pedido.setStatus("ABERTA");
        pedido.setValorTotal(new BigDecimal("10.00"));
        pedido.setCliente1(cliente);

        pedidoRepositorio.save(pedido);


        var itemPedido = new ItemPedido1();

        itemPedido.setQuantidade(2);
        itemPedido.setValorUnitario(new BigDecimal("50.00"));
        itemPedido.setPedido1(pedido);

        itemPedidoRepositorio.save(itemPedido);

        assertNotNull(itemPedido.getId());
    }
}