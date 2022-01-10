package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "commandsuppliers_batchs", schema = "stockmanagement", catalog = "")
public class CommandsuppliersBatchsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_commandsuppliers_batchs")
    private int idCommandsuppliersBatchs;
    @Basic
    @Column(name = "id_commandSupplier")
    private int idCommandSupplier;
    @Basic
    @Column(name = "id_batch")
    private int idBatch;
    @Basic
    @Column(name = "costPrice")
    private int costPrice;
    @Basic
    @Column(name = "lotQuantity")
    private int lotQuantity;

    public int getIdCommandsuppliersBatchs() {
        return idCommandsuppliersBatchs;
    }

    public void setIdCommandsuppliersBatchs(int idCommandsuppliersBatchs) {
        this.idCommandsuppliersBatchs = idCommandsuppliersBatchs;
    }

    public int getIdCommandSupplier() {
        return idCommandSupplier;
    }

    public void setIdCommandSupplier(int idCommandSupplier) {
        this.idCommandSupplier = idCommandSupplier;
    }

    public int getIdBatch() {
        return idBatch;
    }

    public void setIdBatch(int idBatch) {
        this.idBatch = idBatch;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public int getLotQuantity() {
        return lotQuantity;
    }

    public void setLotQuantity(int lotQuantity) {
        this.lotQuantity = lotQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandsuppliersBatchsEntity that = (CommandsuppliersBatchsEntity) o;
        return idCommandsuppliersBatchs == that.idCommandsuppliersBatchs && idCommandSupplier == that.idCommandSupplier && idBatch == that.idBatch && costPrice == that.costPrice && lotQuantity == that.lotQuantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCommandsuppliersBatchs, idCommandSupplier, idBatch, costPrice, lotQuantity);
    }
}
