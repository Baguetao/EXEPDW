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
public class ItemPedido1 {
    @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Integer id;
        private Integer quantidade;
        private BigDecimal valorUnitario;
        

        @ManyToOne
        private Pedido1 pedido1;
}
