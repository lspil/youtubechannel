package my.app.invoicing.service;

import my.app.invoicing.model.Invoice;
import my.app.invoicing.service.impl.InvoiceServiceImpl;

import java.util.List;

public interface InvoiceService {

    List<Invoice> findInvoices();

    static InvoiceService build() {
        return new InvoiceServiceImpl();
    }
}
