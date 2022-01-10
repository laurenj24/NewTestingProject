package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cities", schema = "stockmanagement", catalog = "")
public class CitiesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_city")
    private int idCity;
    @Basic
    @Column(name = "id_country")
    private int idCountry;
    @Basic
    @Column(name = "citie")
    private String citie;
    @Basic
    @Column(name = "postalCode")
    private int postalCode;

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getCitie() {
        return citie;
    }

    public void setCitie(String citie) {
        this.citie = citie;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CitiesEntity that = (CitiesEntity) o;
        return idCity == that.idCity && idCountry == that.idCountry && postalCode == that.postalCode && Objects.equals(citie, that.citie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCity, idCountry, citie, postalCode);
    }
}
