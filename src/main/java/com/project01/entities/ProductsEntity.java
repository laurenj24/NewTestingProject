package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products", schema = "stockmanagement", catalog = "")
public class ProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_product")
    private int idProduct;
    @Basic
    @Column(name = "id_brand")
    private int idBrand;
    @Basic
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "designation")
    private String designation;
    @Basic
    @Column(name = "quantityTotal")
    private int quantityTotal;
    @Basic
    @Column(name = "unitCostPrice")
    private int unitCostPrice;
    @Basic
    @Column(name = "margin")
    private int margin;
    @Basic
    @Column(name = "length")
    private int length;
    @Basic
    @Column(name = "width")
    private int width;
    @Basic
    @Column(name = "height")
    private int height;
    @Basic
    @Column(name = "active")
    private byte active;
    @Basic
    @Column(name = "minimumQte")
    private int minimumQte;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(int idBrand) {
        this.idBrand = idBrand;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getQuantityTotal() {
        return quantityTotal;
    }

    public void setQuantityTotal(int quantityTotal) {
        this.quantityTotal = quantityTotal;
    }

    public int getUnitCostPrice() {
        return unitCostPrice;
    }

    public void setUnitCostPrice(int unitCostPrice) {
        this.unitCostPrice = unitCostPrice;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    public int getMinimumQte() {
        return minimumQte;
    }

    public void setMinimumQte(int minimumQte) {
        this.minimumQte = minimumQte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsEntity that = (ProductsEntity) o;
        return idProduct == that.idProduct && idBrand == that.idBrand && quantityTotal == that.quantityTotal && unitCostPrice == that.unitCostPrice && margin == that.margin && length == that.length && width == that.width && height == that.height && active == that.active && minimumQte == that.minimumQte && Objects.equals(code, that.code) && Objects.equals(designation, that.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, idBrand, code, designation, quantityTotal, unitCostPrice, margin, length, width, height, active, minimumQte);
    }
}
