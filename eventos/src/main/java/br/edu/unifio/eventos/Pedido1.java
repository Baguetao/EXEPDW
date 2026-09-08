package br.edu.unifio.eventos;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Getter
@Setter
@Entity
public class Pedido1 {

    @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Integer id;
        private LocalDateTime data;
        private String status;
        private BigDecimal valorTotal;

        @ManyToOne
        private Cliente1 cliente1;

}
