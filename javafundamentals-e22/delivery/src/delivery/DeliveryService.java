package delivery;

import invoicing.model.Invoice;
import invoicing.services.InvoiceService;

import java.util.List;

public class DeliveryService {

    private InvoiceService service = InvoiceService.build();

    public List<Invoice> deliver() {
        List<Invoice> invoices = service.generateInvoices();
        invoices.forEach(System.out::println);
        return invoices;
    }
}
