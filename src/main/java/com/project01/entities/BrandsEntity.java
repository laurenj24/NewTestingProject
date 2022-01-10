package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "brands", schema = "stockmanagement", catalog = "")
public class BrandsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_brand")
    private int idBrand;
    @Basic
    @Column(name = "brand")
    private String brand;

    public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(int idBrand) {
        this.idBrand = idBrand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrandsEntity that = (BrandsEntity) o;
        return idBrand == that.idBrand && Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBrand, brand);
    }
}
