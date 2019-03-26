package br.com.fiap.orderservice.controller;

import br.com.fiap.orderservice.model.OrderDTO;
import br.com.fiap.orderservice.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(value = "/order", produces = "application/json")
public class OrderServiceController {

    private OrderService orderService;

    @Autowired
    public OrderServiceController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> findById(@PathVariable(value="id") int id){
        System.out.printf("findById %s", id);
        OrderDTO orderDTO = orderService.findById(id);

        if(orderDTO == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(orderDTO);
        }
    }

    @PostMapping
    public ResponseEntity save(@RequestBody @Valid OrderDTO orderDTO){
        orderDTO = orderService.save(orderDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("{ \"order-service\" : \"/order/"+orderDTO.getId()+ "\"}");
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable int id, @RequestBody @Valid OrderDTO orderDTO) {
        orderDTO = orderService.update(id,orderDTO);

        if(orderDTO == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }else {
            return ResponseEntity.status(HttpStatus.OK).body("{ \"order-service\" : \"/order-service/" + orderDTO.getId() + "\"}");
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        orderService.delete(id);
    }

    @GetMapping("/")
    public ResponseEntity<OrderDTO> getOrders(OrderDTO orderDTO){
        log.info("getOrders {} {}", orderDTO.getName(), orderDTO.getId());
        return new ResponseEntity<>(orderDTO, HttpStatus.OK);
    }
}