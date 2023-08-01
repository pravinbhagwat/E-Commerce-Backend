package com.digitox.ecommercebackend.services;

import com.digitox.ecommercebackend.models.Order;
import com.digitox.ecommercebackend.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final ProductService productService;
    private final CustomerService customerService;

    @Autowired
    public OrderService(OrderRepository orderRepository, ProductService productService, CustomerService customerService) {
        this.orderRepository = orderRepository;
        this.productService = productService;
        this.customerService = customerService;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Order with id " + id + " not found"));
    }

    public Order createOrder(Order order) {
        validateOrder(order);
        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order updateOrder) {
        Order existingOrder = getOrderById(id);
        validateOrder(updateOrder);
        existingOrder.setCustomer(updateOrder.getCustomer());
        existingOrder.setProduct(updateOrder.getProduct());
        existingOrder.setCustomer(updateOrder.getCustomer());
        existingOrder.setQuantity(updateOrder.getQuantity());
        return orderRepository.save(existingOrder);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
    private void validateOrder(Order order) {
        productService.getProductById(order.getProduct().getId());
        customerService.getCustomerById(order.getCustomer().getId());
    }

}
