package my.app.invoicing.service.impl;

import my.app.invoicing.model.Invoice;
import my.app.invoicing.service.InvoiceService;

import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {

    @Override
    public List<Invoice> findInvoices() {
        return List.of(new Invoice("abcde"));
    }
}
