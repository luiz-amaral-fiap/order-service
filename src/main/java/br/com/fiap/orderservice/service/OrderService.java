package br.com.fiap.orderservice.service;

import br.com.fiap.orderservice.exceptionHandler.EmptyResultDataException;
import br.com.fiap.orderservice.exceptionHandler.InvalidDataException;
import br.com.fiap.orderservice.model.OrderDTO;
import br.com.fiap.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDTO findById(int id) {
        OrderDTO orderDTODb = orderRepository.findById(id);
        if(orderDTODb == null){ throw new EmptyResultDataException(); }
        return orderDTODb;
    }

    public OrderDTO save(OrderDTO orderDTO){
        if(orderDTO.getEmail()==null){ throw new InvalidDataException(); }
        return orderRepository.save(orderDTO);
    }

    public OrderDTO update(int id, OrderDTO orderDTO){
        OrderDTO orderDTODb = orderRepository.findById(id);
        if(orderDTO.getEmail()==null){ throw new InvalidDataException(); }
        orderDTO.setId(orderDTODb.getId());
        return orderRepository.update(orderDTO);
    }

    public OrderDTO delete(int id){ return orderRepository.delete(id); }

    public List<OrderDTO> getOrders(OrderDTO orderDTO){ return orderRepository.getOrders(); }
}