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
    public void SearchItemPedidoByID (){

        ItemPedido1 itempedido = itemPedidoRepositorio.findById (Integer3).orElseThrow();



    }

    @Test 
    public void TakeAllItemPedido() {
       List<ItemPedido1> itemPedido = itemPedidoRepositorio.findAll(Sort.by("quantidade"));

        assertEquals(5,itemPedido.size());
    }

    @Test
    public void DeleteItemPedido(){

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


    }

    @Test
    public void UpdateItemPedido(){

        ItemPedido1 itempedido = itemPedidoRepositorio.findById(Short.parseShort("1")).orElseThrow();

    


    }



}
