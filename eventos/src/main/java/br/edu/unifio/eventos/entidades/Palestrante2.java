package br.edu.unifio.eventos.entidades;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Getter
@Setter
@Entity
public class Palestrante2 {
     @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Integer id;
        private String miniBio;
        private String nome;
        private String email;

}
