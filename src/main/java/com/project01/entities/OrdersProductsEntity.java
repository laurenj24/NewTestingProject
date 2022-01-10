package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orders_products", schema = "stockmanagement", catalog = "")
public class OrdersProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_orders_products")
    private int idOrdersProducts;
    @Basic
    @Column(name = "id_order")
    private int idOrder;
    @Basic
    @Column(name = "id_product")
    private int idProduct;
    @Basic
    @Column(name = "qteUnits")
    private int qteUnits;
    @Basic
    @Column(name = "unitPrice")
    private int unitPrice;
    @Basic
    @Column(name = "deliver")
    private Byte deliver;

    public int getIdOrdersProducts() {
        return idOrdersProducts;
    }

    public void setIdOrdersProducts(int idOrdersProducts) {
        this.idOrdersProducts = idOrdersProducts;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getQteUnits() {
        return qteUnits;
    }

    public void setQteUnits(int qteUnits) {
        this.qteUnits = qteUnits;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Byte getDeliver() {
        return deliver;
    }

    public void setDeliver(Byte deliver) {
        this.deliver = deliver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersProductsEntity that = (OrdersProductsEntity) o;
        return idOrdersProducts == that.idOrdersProducts && idOrder == that.idOrder && idProduct == that.idProduct && qteUnits == that.qteUnits && unitPrice == that.unitPrice && Objects.equals(deliver, that.deliver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrdersProducts, idOrder, idProduct, qteUnits, unitPrice, deliver);
    }
}
