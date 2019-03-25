package br.com.fiap.orderservice.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {
    private int id;
    private String name;
    private BigDecimal price;
}
