package br.com.fiap.orderservice.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {
    private int id;
    private String idTransaction;
    private String cardNumber;
    private LocalDate cardExpirationDate;
    private String cardFlag;
}
