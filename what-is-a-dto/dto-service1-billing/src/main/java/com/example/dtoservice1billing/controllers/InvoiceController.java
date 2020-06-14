package com.example.dtoservice1billing.controllers;

import com.example.dtoservice1billing.dto.Invoice;
import com.example.dtoservice1billing.dto.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InvoiceController {

    @PostMapping("/invoice")
    public Invoice createInvoice(@RequestBody Product p) {
        var i = new Invoice();
        i.setProducts(List.of(p));
        return i;
    }
}
