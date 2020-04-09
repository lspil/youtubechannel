package com.example.springbootjava14modules.controllers;

import my.app.invoicing.model.Invoice;
import my.app.invoicing.service.InvoiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/invoices")
    public List<Invoice> invoices() {
        InvoiceService service = InvoiceService.build();
        return service.findInvoices();
    }
}
