package br.com.fiap.orderservice.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private int id;
    private String name;
    private String email;
    private String shippingAddress;
    private List<OrderItemDTO> orderItemDTOS;
    private PaymentDTO paymentDTO;
    private LocalDate orderDate;
    private BigDecimal totalPrice;
    private String status;
}
