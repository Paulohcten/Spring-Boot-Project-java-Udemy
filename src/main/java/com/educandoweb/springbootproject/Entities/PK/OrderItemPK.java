package com.educandoweb.springbootproject.Entities.PK;

import com.educandoweb.springbootproject.Entities.Orders;
import com.educandoweb.springbootproject.Entities.Product;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    private Orders orders;

    @ManyToOne
    private Product product;

    public OrderItemPK(){
    }

    public OrderItemPK(Orders orders, Product product) {
        this.orders = orders;
        this.product = product;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemPK)) return false;
        OrderItemPK that = (OrderItemPK) o;
        return orders.equals(that.orders) && product.equals(that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders, product);
    }
}
