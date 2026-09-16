package br.edu.unifio.eventos.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.eventos.entidades.Cliente1;
import br.edu.unifio.eventos.repositorios.ClienteRepositorio;

@SpringBootTest
public class ClienteRepositorioTests {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    public void SaveClienteNovo() {

        var cliente = new Cliente1();

        cliente.setNome("Enzo Luiz");
        cliente.setEmail("Enzex@gmail.com");
        cliente.setTelefone("67676767");

        clienteRepositorio.save(cliente);

        assertNotNull(cliente.getId());
    }
}