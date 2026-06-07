package com.manoj.ecommerce.controller;

import com.manoj.ecommerce.entity.Cart;
import com.manoj.ecommerce.entity.Product;
import com.manoj.ecommerce.repository.CartRepository;
import com.manoj.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductRepository productRepository;
    private final CartRepository cartRepository;

    public ProductController(ProductRepository productRepository,
                             CartRepository cartRepository) {

        this.productRepository = productRepository;
        this.cartRepository = cartRepository;
    }

    @GetMapping("/")
    public String home(
            @RequestParam(required = false)
            String keyword,
            Model model) {

        if (keyword != null && !keyword.isEmpty()) {

            model.addAttribute("products",
                    productRepository.findByNameContaining(keyword));

            model.addAttribute("showCarousel", false);

        } else {

            model.addAttribute("products",
                    productRepository.findAll());

            model.addAttribute("showCarousel", true);
        }

        model.addAttribute("cartCount",
                cartRepository.count());

        return "products";
    }

    @GetMapping("/product/{id}")
    public String productDetails(@PathVariable Long id,
                                 @RequestParam(required = false)
                                 String added,
                                 Model model) {

        Product product =
                productRepository.findById(id).orElse(null);

        model.addAttribute("product", product);

        if (added != null) {
            model.addAttribute("added", true);
        }

        return "product-details";
    }

    @GetMapping("/add-product")
    public String addProductPage() {

        return "add-product";
    }

    @PostMapping("/add-product")
    public String saveProduct(Product product) {

        productRepository.save(product);

        return "redirect:/";
    }

    @GetMapping("/cart/add/{id}")
    public String addToCart(@PathVariable Long id) {

        Product product =
                productRepository.findById(id).orElse(null);

        if (product != null) {

            Cart cart = new Cart();

            cart.setProductId(product.getId());
            cart.setProductName(product.getName());
            cart.setPrice(product.getPrice());

            cartRepository.save(cart);
        }

        return "redirect:/product/" + id + "?added=true";
    }
}