package br.com.fiap.orderservice.model;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(notes = "The database generated Order ID")
    private int id;
    @ApiModelProperty( notes = "User Name", required = true)
    private String name;
    @ApiModelProperty( notes = "User E-mail", required = true)
    private String email;
    @ApiModelProperty( notes = "The order shipping address", required = true)
    private String shippingAddress;
    @ApiModelProperty( notes = "Order Items", required = true)
    private List<OrderItemDTO> orderItemDTOS;
    @ApiModelProperty( notes = "Payment Data" )
    private PaymentDTO paymentDTO;
    @ApiModelProperty( notes = "Order Date", required = true)
    private LocalDate orderDate;
    @ApiModelProperty( notes = "The order total price", required = true)
    private BigDecimal totalPrice;
    @ApiModelProperty( notes = "Order Status", required = true)
    private String status;
}
