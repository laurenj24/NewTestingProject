package com.project01.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "commandsuppliers", schema = "stockmanagement", catalog = "")
public class CommandsuppliersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_commandSuppliers")
    private int idCommandSuppliers;
    @Basic
    @Column(name = "id_supplier")
    private int idSupplier;
    @Basic
    @Column(name = "id_user")
    private int idUser;
    @Basic
    @Column(name = "orderDate")
    private Date orderDate;

    public int getIdCommandSuppliers() {
        return idCommandSuppliers;
    }

    public void setIdCommandSuppliers(int idCommandSuppliers) {
        this.idCommandSuppliers = idCommandSuppliers;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandsuppliersEntity that = (CommandsuppliersEntity) o;
        return idCommandSuppliers == that.idCommandSuppliers && idSupplier == that.idSupplier && idUser == that.idUser && Objects.equals(orderDate, that.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCommandSuppliers, idSupplier, idUser, orderDate);
    }
}
