package com.manoj.ecommerce.controller;

import com.manoj.ecommerce.repository.CartRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CartController {

    private final CartRepository cartRepository;

    public CartController(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @GetMapping("/cart")
    public String cartPage(Model model) {

        var cartItems = cartRepository.findAll();

        double total = 0;

        for(var item : cartItems)
        {
            total += item.getPrice();
        }

        model.addAttribute("cartItems", cartItems);
        model.addAttribute("total", total);

        return "cart";
    }
    @GetMapping("/cart/remove/{id}")
    public String removeFromCart(@PathVariable Long id)
    {
        cartRepository.deleteById(id);

        return "redirect:/cart";
    }
}