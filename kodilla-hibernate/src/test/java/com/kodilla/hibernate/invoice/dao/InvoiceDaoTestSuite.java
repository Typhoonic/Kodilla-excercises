package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){

        //Given
        Product elmex = new Product("Elmex");
        Product juice = new Product("Juice");

        Item forElmex = new Item(3, new BigDecimal(20), new BigDecimal(25.59));
        Item forJuice = new Item(5, new BigDecimal(30), new BigDecimal(37.56));

        elmex.getItems().add(forElmex);
        juice.getItems().add(forJuice);

        forElmex.setProducts(elmex);
        forJuice.setProducts(juice);

        Invoice invoice = new Invoice("FV 5/06/21");

        invoice.getItems().add(forElmex);
        invoice.getItems().add(forJuice);

        forElmex.setInvoice(invoice);
        forJuice.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);

    }
}
