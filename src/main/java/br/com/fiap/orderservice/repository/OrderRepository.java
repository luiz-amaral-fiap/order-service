package br.com.fiap.orderservice.repository;

import br.com.fiap.orderservice.model.OrderDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private List<OrderDTO> orders;

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

    public OrderDTO update(OrderDTO orderDTO){
        int index = orders.indexOf((orderDTO));
        orders.set(index,orderDTO);
        return orderDTO;
    }

    public OrderDTO delete(int id){
        OrderDTO orderDTODb = findById(id);
        orders.remove(orderDTODb);
        return orderDTODb;
    }

    public List<OrderDTO> getOrders(){ return orders; }
}
