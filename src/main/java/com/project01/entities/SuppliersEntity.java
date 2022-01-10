package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "suppliers", schema = "stockmanagement", catalog = "")
public class SuppliersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_supplier")
    private int idSupplier;
    @Basic
    @Column(name = "name")
    private String name;

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuppliersEntity that = (SuppliersEntity) o;
        return idSupplier == that.idSupplier && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSupplier, name);
    }
}
