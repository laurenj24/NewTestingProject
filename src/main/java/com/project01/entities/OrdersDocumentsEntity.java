package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orders_documents", schema = "stockmanagement", catalog = "")
public class OrdersDocumentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_orders_docuements")
    private int idOrdersDocuements;
    @Basic
    @Column(name = "id_order")
    private int idOrder;
    @Basic
    @Column(name = "id_document")
    private int idDocument;

    public int getIdOrdersDocuements() {
        return idOrdersDocuements;
    }

    public void setIdOrdersDocuements(int idOrdersDocuements) {
        this.idOrdersDocuements = idOrdersDocuements;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersDocumentsEntity that = (OrdersDocumentsEntity) o;
        return idOrdersDocuements == that.idOrdersDocuements && idOrder == that.idOrder && idDocument == that.idDocument;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrdersDocuements, idOrder, idDocument);
    }
}
