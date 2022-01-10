package com.project01.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "stockmanagement", catalog = "")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_order")
    private int idOrder;
    @Basic
    @Column(name = "Id_user")
    private int idUser;
    @Basic
    @Column(name = "reduction")
    private Integer reduction;
    @Basic
    @Column(name = "dateORder")
    private Date dateORder;
    @Basic
    @Column(name = "payed")
    private Byte payed;
    @Basic
    @Column(name = "payementDate")
    private Date payementDate;
    @Basic
    @Column(name = "deliver")
    private Byte deliver;
    @Basic
    @Column(name = "deliverDate")
    private Date deliverDate;
    @Basic
    @Column(name = "modeOfPayement")
    private Object modeOfPayement;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Integer getReduction() {
        return reduction;
    }

    public void setReduction(Integer reduction) {
        this.reduction = reduction;
    }

    public Date getDateORder() {
        return dateORder;
    }

    public void setDateORder(Date dateORder) {
        this.dateORder = dateORder;
    }

    public Byte getPayed() {
        return payed;
    }

    public void setPayed(Byte payed) {
        this.payed = payed;
    }

    public Date getPayementDate() {
        return payementDate;
    }

    public void setPayementDate(Date payementDate) {
        this.payementDate = payementDate;
    }

    public Byte getDeliver() {
        return deliver;
    }

    public void setDeliver(Byte deliver) {
        this.deliver = deliver;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public Object getModeOfPayement() {
        return modeOfPayement;
    }

    public void setModeOfPayement(Object modeOfPayement) {
        this.modeOfPayement = modeOfPayement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return idOrder == that.idOrder && idUser == that.idUser && Objects.equals(reduction, that.reduction) && Objects.equals(dateORder, that.dateORder) && Objects.equals(payed, that.payed) && Objects.equals(payementDate, that.payementDate) && Objects.equals(deliver, that.deliver) && Objects.equals(deliverDate, that.deliverDate) && Objects.equals(modeOfPayement, that.modeOfPayement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrder, idUser, reduction, dateORder, payed, payementDate, deliver, deliverDate, modeOfPayement);
    }
}
