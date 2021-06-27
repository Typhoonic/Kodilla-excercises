package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {

    private int id;
    private int quantity;
    private BigDecimal price;
    private BigDecimal value;
    private Product products;
    private Invoice invoice;

    public Item() {
    }

    public Item(int quantity, BigDecimal price, BigDecimal value) {
        this.quantity = quantity;
        this.price = price;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProducts() {
        return products;
    }

    @ManyToOne()
    @JoinColumn(name = "INVOICE_ID")
    private Invoice getInvoice() {
        return invoice;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
