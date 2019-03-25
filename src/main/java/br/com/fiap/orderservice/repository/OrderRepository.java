package br.com.fiap.orderservice.repository;

import br.com.fiap.orderservice.model.OrderDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private List<OrderDTO> orders = new ArrayList<>();

    public OrderRepository(){
        orders = new ArrayList<>();
    }

    public OrderDTO findById(int id) {
        return orders.stream().filter((orderDTO) -> orderDTO.getId() == id).findFirst().orElse(null);
    }

    public OrderDTO save(OrderDTO orderDTO){
        orderDTO.setId(orders.size()+1);
        this.orders.add(orderDTO);
        return orderDTO;
    }

    public OrderDTO update(int id, OrderDTO orderDTO){
        OrderDTO orderDb = findById(id);
        int index = orders.indexOf((orderDb));
        orders.set(index,orderDTO);
        return orderDTO;
    }

    public OrderDTO delete(int id){
        OrderDTO orderDb = findById(id);
        int index = orders.indexOf((orderDb));
        orders.remove(index);
        return orderDb;
    }

    public List<OrderDTO> getOrders(){ return orders; }
}
