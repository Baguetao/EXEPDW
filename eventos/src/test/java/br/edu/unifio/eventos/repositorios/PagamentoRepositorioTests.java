package br.edu.unifio.eventos.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.eventos.entidades.Cliente1;
import br.edu.unifio.eventos.entidades.Pagamento1;
import br.edu.unifio.eventos.entidades.Pedido1;

@SpringBootTest
public class PagamentoRepositorioTests {

    @Autowired
    private PagamentoRepositorio pagamentoRepositorio;

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    public void deveSalvarUmPagamentoNovo() {

        var cliente = new Cliente1();

        cliente.setNome("João Silva");
        cliente.setEmail("joao@email.com");
        cliente.setTelefone("999991");

        clienteRepositorio.save(cliente);


        var pedido = new Pedido1();

        pedido.setData(LocalDateTime.now());
        pedido.setStatus("PENDENTE");
        pedido.setValorTotal(new BigDecimal("100.00"));
        pedido.setCliente1(cliente);

        pedidoRepositorio.save(pedido);


        var pagamento = new Pagamento1();

        pagamento.setValor(new BigDecimal("100.00"));
        pagamento.setData(LocalDateTime.now());
        pagamento.setStatus("APROVADO");
        pagamento.setTipo("PIX");
        pagamento.setPedido1(pedido);

        pagamentoRepositorio.save(pagamento);

        assertNotNull(pagamento.getId());
    }
}