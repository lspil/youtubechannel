package invoicing.services;

import invoicing.model.Invoice;
import invoicing.services.impl.InvoiceServiceImpl;

import java.util.List;

public interface InvoiceService {

    List<Invoice> generateInvoices();

    static InvoiceService build() {
        return new InvoiceServiceImpl();
    }
}
