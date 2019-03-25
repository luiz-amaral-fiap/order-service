package br.com.fiap.orderservice.service;

import br.com.fiap.orderservice.model.OrderDTO;
import br.com.fiap.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDTO findById(int id) {
        return orderRepository.findById(id);
    }

    public OrderDTO save(OrderDTO orderDTO){ return orderRepository.save(orderDTO); }

    public OrderDTO update(int id, OrderDTO orderDTO){ return orderRepository.update(id,orderDTO); }

    public OrderDTO delete(int id){ return orderRepository.delete(id); }

    public OrderDTO getOrders(OrderDTO orderDTO){ return orderRepository.save(orderDTO); }
}