package br.edu.unifio.eventos.repositorios;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.eventos.entidades.Categoria2;

@SpringBootTest
class CategoriaRepositorioTest {

    @Autowired
    private CategoriaRepositorio repositorio;

    @Test
    void insercao() {
        Categoria2 categoria = new Categoria2();

        categoria.setNome("Tecnologia");
        categoria.setDescricao("Eventos relacionados à tecnologia");

        Categoria2 categoriaSalva = repositorio.save(categoria);

        assertNotNull(categoriaSalva.getId());
        assertEquals("Tecnologia", categoriaSalva.getNome());
        assertEquals("Eventos relacionados à tecnologia", categoriaSalva.getDescricao());
    }

    @Test
    void buscaPorId() {
        Categoria2 categoria = new Categoria2();

        categoria.setNome("Esportes");
        categoria.setDescricao("Eventos esportivos");

        Categoria2 categoriaSalva = repositorio.save(categoria);

        Categoria2 categoriaEncontrada =
                repositorio.findById(categoriaSalva.getId()).orElse(null);

        assertNotNull(categoriaEncontrada);
        assertEquals("Esportes", categoriaEncontrada.getNome());
        assertEquals("Eventos esportivos", categoriaEncontrada.getDescricao());
    }

    @Test
    void listagem() {
        Categoria2 categoria1 = new Categoria2();
        categoria1.setNome("Música");
        categoria1.setDescricao("Eventos musicais");

        Categoria2 categoria2 = new Categoria2();
        categoria2.setNome("Cinema");
        categoria2.setDescricao("Eventos relacionados ao cinema");

        repositorio.save(categoria1);
        repositorio.save(categoria2);

        List<Categoria2> categorias = repositorio.findAll();

        assertTrue(categorias.size() >= 2);
        assertTrue(categorias.stream()
                .anyMatch(c -> c.getNome().equals("Música")));
        assertTrue(categorias.stream()
                .anyMatch(c -> c.getNome().equals("Cinema")));
    }

    @Test
    void alteracao() {
        Categoria2 categoria = new Categoria2();

        categoria.setNome("Educação");
        categoria.setDescricao("Eventos educacionais");

        Categoria2 categoriaSalva = repositorio.save(categoria);

        Integer id = categoriaSalva.getId();

        categoriaSalva.setNome("Educação e Ensino");
        repositorio.save(categoriaSalva);

        Categoria2 categoriaAlterada =
                repositorio.findById(id).orElse(null);

        assertNotNull(categoriaAlterada);
        assertEquals(id, categoriaAlterada.getId());
        assertEquals("Educação e Ensino", categoriaAlterada.getNome());
    }

    @Test
    void exclusao() {
        Categoria2 categoria = new Categoria2();

        categoria.setNome("Saúde");
        categoria.setDescricao("Eventos relacionados à saúde");

        Categoria2 categoriaSalva = repositorio.save(categoria);

        Integer id = categoriaSalva.getId();

        assertTrue(repositorio.existsById(id));

        repositorio.deleteById(id);

        assertFalse(repositorio.existsById(id));
    }
}