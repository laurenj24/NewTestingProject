package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "batchs", schema = "stockmanagement", catalog = "")
public class BatchsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_batch")
    private int idBatch;
    @Basic
    @Column(name = "id_products")
    private int idProducts;
    @Basic
    @Column(name = "quantity")
    private int quantity;
    @Basic
    @Column(name = "uniPrice")
    private int uniPrice;
    @Basic
    @Column(name = "numberBatch")
    private int numberBatch;

    public int getIdBatch() {
        return idBatch;
    }

    public void setIdBatch(int idBatch) {
        this.idBatch = idBatch;
    }

    public int getIdProducts() {
        return idProducts;
    }

    public void setIdProducts(int idProducts) {
        this.idProducts = idProducts;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUniPrice() {
        return uniPrice;
    }

    public void setUniPrice(int uniPrice) {
        this.uniPrice = uniPrice;
    }

    public int getNumberBatch() {
        return numberBatch;
    }

    public void setNumberBatch(int numberBatch) {
        this.numberBatch = numberBatch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BatchsEntity that = (BatchsEntity) o;
        return idBatch == that.idBatch && idProducts == that.idProducts && quantity == that.quantity && uniPrice == that.uniPrice && numberBatch == that.numberBatch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBatch, idProducts, quantity, uniPrice, numberBatch);
    }
}
