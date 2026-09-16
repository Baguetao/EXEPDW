package br.edu.unifio.eventos.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import br.edu.unifio.eventos.entidades.Cliente1;
import br.edu.unifio.eventos.entidades.ItemPedido1;
import br.edu.unifio.eventos.entidades.Pedido1;
import br.edu.unifio.eventos.repositorios.ClienteRepositorio;
import br.edu.unifio.eventos.repositorios.ItemPedidoRepositorio;
import br.edu.unifio.eventos.repositorios.PedidoRepositorio;

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
        pedido.setValorTotal(new BigDecimal("100.00"));
        pedido.setCliente1(cliente);

        pedidoRepositorio.save(pedido);


        var itemPedido = new ItemPedido1();

        itemPedido.setQuantidade(2);
        itemPedido.setValorUnitario(new BigDecimal("50.00"));
        itemPedido.setPedido1(pedido);

        itemPedidoRepositorio.save(itemPedido);

        assertNotNull(itemPedido.getId());
    }
    @Test
    public void SearchItemPedidoByID() {

        Integer id = 1;

        ItemPedido1 itemPedido = itemPedidoRepositorio
                .findById(id)
                .orElseThrow();

        assertNotNull(itemPedido);
        assertEquals(id, itemPedido.getId());
    }


    @Test
    public void TakeAllItemPedido() {

        List<ItemPedido1> itensPedido =
                itemPedidoRepositorio.findAll(Sort.by("quantidade"));

        assertNotNull(itensPedido);
        assertEquals(5, itensPedido.size());
    }


    @Test
    public void DeleteItemPedido() {

        Cliente1 cliente = new Cliente1();
        cliente.setNome("João Silvio");
        cliente.setEmail("JotaSao@email.com");
        cliente.setTelefone("999111221");

        clienteRepositorio.save(cliente);


        Pedido1 pedido = new Pedido1();
        pedido.setData(LocalDateTime.now());
        pedido.setStatus("ABERTA");
        pedido.setValorTotal(new BigDecimal("300.00"));
        pedido.setCliente1(cliente);

        pedidoRepositorio.save(pedido);


        ItemPedido1 itemPedido = new ItemPedido1();
        itemPedido.setQuantidade(2);
        itemPedido.setValorUnitario(new BigDecimal("150.00"));
        itemPedido.setPedido1(pedido);

        ItemPedido1 itemSalvo = itemPedidoRepositorio.save(itemPedido);


        assertNotNull(itemSalvo.getId());
     
    }


    @Test
    public void UpdateItemPedido() {

        Integer id = 1;

        ItemPedido1 itemPedido = itemPedidoRepositorio
                .findById(id)
                .orElseThrow();


        Integer quantidadeAntiga = itemPedido.getQuantidade();


        itemPedido.setQuantidade(10);
        ItemPedido1 itemAtualizado =
                itemPedidoRepositorio.save(itemPedido);


        assertEquals(Integer.valueOf(10), itemAtualizado.getQuantidade());

        ItemPedido1 itemBanco =
                itemPedidoRepositorio.findById(id)
                        .orElseThrow();

        assertEquals(Integer.valueOf(10), itemBanco.getQuantidade());
        assertNotEquals(quantidadeAntiga, itemBanco.getQuantidade());
    }

    
}
