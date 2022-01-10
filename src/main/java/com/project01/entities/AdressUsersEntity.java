package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "adress_users", schema = "stockmanagement", catalog = "")
public class AdressUsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_adress_users")
    private int idAdressUsers;
    @Basic
    @Column(name = "id_adress")
    private int idAdress;
    @Basic
    @Column(name = "id_user")
    private int idUser;
    @Basic
    @Column(name = "typeAdress")
    private Object typeAdress;

    public int getIdAdressUsers() {
        return idAdressUsers;
    }

    public void setIdAdressUsers(int idAdressUsers) {
        this.idAdressUsers = idAdressUsers;
    }

    public int getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(int idAdress) {
        this.idAdress = idAdress;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Object getTypeAdress() {
        return typeAdress;
    }

    public void setTypeAdress(Object typeAdress) {
        this.typeAdress = typeAdress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdressUsersEntity that = (AdressUsersEntity) o;
        return idAdressUsers == that.idAdressUsers && idAdress == that.idAdress && idUser == that.idUser && Objects.equals(typeAdress, that.typeAdress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdressUsers, idAdress, idUser, typeAdress);
    }
}
