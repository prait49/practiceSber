package com.example.project.controller;

import com.example.project.Table.Sale;
import com.example.project.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SaleController {
    @Autowired
    private SaleRepository saleRepository;

    private String currentSeller = "";

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/startSales")
    public String startSales(@RequestParam String sellerName) {
        currentSeller = sellerName;
        return "redirect:/sales";
    }

    @GetMapping("/sales")
    public String sales(Model model) {
        model.addAttribute("seller", currentSeller);
        List<Sale> sales = saleRepository.findAll();
        model.addAttribute("sales", sales);
        return "sales";
    }

    @PostMapping("/addSale")
    public String addSale(@RequestParam double amount, @RequestParam int productId) {
        Sale sale = new Sale();
        sale.setAmount(amount);
        sale.setProductId(productId);
        saleRepository.save(sale);
        return "redirect:/sales";
    }
}