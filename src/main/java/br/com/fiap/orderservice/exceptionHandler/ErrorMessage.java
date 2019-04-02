package br.com.fiap.orderservice.exceptionHandler;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
    private String error;
}