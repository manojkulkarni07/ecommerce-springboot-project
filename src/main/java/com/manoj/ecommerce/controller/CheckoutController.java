package com.manoj.ecommerce.controller;

import com.manoj.ecommerce.entity.Product;
import com.manoj.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CheckoutController {

    private final ProductRepository productRepository;

    public CheckoutController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/checkout/{id}")
    public String checkoutPage(@PathVariable Long id,
                               Model model) {

        Product product =
                productRepository.findById(id).orElse(null);

        model.addAttribute("product", product);

        return "checkout";
    }
    @GetMapping("/checkout")
    public String checkoutPageWithoutProduct() {
        return "cart-checkout";
    }
    }

