package br.edu.unifio.eventos;
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
public class Inscricao2 {
     @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Integer id;
        private LocalDate dataInscricao;
        private String status;

        @ManyToOne
        private Evento2 evento2; 
        @ManyToOne
        private Participante2 participante2; 
}
