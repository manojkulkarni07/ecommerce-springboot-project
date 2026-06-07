package com.manoj.ecommerce.controller;

import com.manoj.ecommerce.entity.Order;
import com.manoj.ecommerce.entity.Product;
import com.manoj.ecommerce.repository.CartRepository;
import com.manoj.ecommerce.repository.OrderRepository;
import com.manoj.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderSuccessController {

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public OrderSuccessController(CartRepository cartRepository,
                                  ProductRepository productRepository,
                                  OrderRepository orderRepository) {

        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    @PostMapping("/place-order/{id}")
    public String placeOrder(@PathVariable Long id,
                             @RequestParam String customerName,
                             @RequestParam String address,
                             @RequestParam String phoneNumber,
                             @RequestParam String paymentMethod) {

        Product product =
                productRepository.findById(id).orElse(null);

        if(product != null)
        {
            Order order = new Order();

            order.setCustomerName(customerName);
            order.setAddress(address);
            order.setPhoneNumber(phoneNumber);
            order.setPaymentMethod(paymentMethod);

            order.setProductName(product.getName());
            order.setPrice(product.getPrice());

            orderRepository.save(order);
        }

        cartRepository.deleteAll();

        return "order-success";
    }
    @GetMapping("/place-order")
    public String placeCartOrder()
    {
        cartRepository.deleteAll();

        return "order-success";
    }
}