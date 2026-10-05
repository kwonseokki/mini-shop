package com.shop.controller;

import com.shop.dto.ProductDTO;
import com.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @RequestMapping("/list")
    public String getProductList(Model model) {
        List<ProductDTO> productList = productService.getProductList();

        model.addAttribute("productList" ,productList);

        return "product/list";
    }

    @RequestMapping("/detail")
    public String getProduct(Model model, @RequestParam("id") Long id) {
        ProductDTO product = productService.getProductById(id);

        model.addAttribute("product", product);

        return "product/detail";
    }
}
