package invoicing.services.impl;

import invoicing.model.Invoice;
import invoicing.services.InvoiceService;

import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {

    @Override
    public List<Invoice> generateInvoices() {
        var i = new Invoice();
        i.setAmount(10);
        return List.of(i);
    }
}
