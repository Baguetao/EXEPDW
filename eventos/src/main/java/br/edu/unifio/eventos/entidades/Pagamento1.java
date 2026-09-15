package br.edu.unifio.eventos.entidades;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Getter
@Setter
@Entity
public class Pagamento1 {
    @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Integer id;
        private BigDecimal valor;
        private LocalDateTime data;
        private String status;
        private String tipo;

        @OneToOne
        private Pedido1 pedido1;
}   
