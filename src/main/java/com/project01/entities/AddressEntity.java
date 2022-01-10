package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "stockmanagement", catalog = "")
public class AddressEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_adress")
    private int idAdress;
    @Basic
    @Column(name = "id_city")
    private int idCity;
    @Basic
    @Column(name = "street")
    private String street;
    @Basic
    @Column(name = "number")
    private int number;
    @Basic
    @Column(name = "box")
    private Integer box;

    public int getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(int idAdress) {
        this.idAdress = idAdress;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Integer getBox() {
        return box;
    }

    public void setBox(Integer box) {
        this.box = box;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return idAdress == that.idAdress && idCity == that.idCity && number == that.number && Objects.equals(street, that.street) && Objects.equals(box, that.box);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdress, idCity, street, number, box);
    }
}
