package com.amart.service;

import com.amart.model.Order;
import com.amart.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Integer id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> updateOrder(Integer id, Order updatedOrder) {
        return orderRepository.findById(id)
                .map(order -> {
                    order.setCustId(updatedOrder.getCustId());
                    order.setProdId(updatedOrder.getProdId());
                    order.setOrderDate(updatedOrder.getOrderDate());
                    order.setStatus(updatedOrder.getStatus());
                    return orderRepository.save(order);
                });
    }

    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
    }
}
