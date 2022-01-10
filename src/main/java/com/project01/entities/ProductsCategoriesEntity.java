package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products_categories", schema = "stockmanagement", catalog = "")
public class ProductsCategoriesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_products_categories")
    private int idProductsCategories;
    @Basic
    @Column(name = "id_product")
    private int idProduct;
    @Basic
    @Column(name = "id_category")
    private int idCategory;

    public int getIdProductsCategories() {
        return idProductsCategories;
    }

    public void setIdProductsCategories(int idProductsCategories) {
        this.idProductsCategories = idProductsCategories;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsCategoriesEntity that = (ProductsCategoriesEntity) o;
        return idProductsCategories == that.idProductsCategories && idProduct == that.idProduct && idCategory == that.idCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProductsCategories, idProduct, idCategory);
    }
}
