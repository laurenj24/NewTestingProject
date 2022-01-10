package com.project01.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "stockmanagement", catalog = "")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_user")
    private int idUser;
    @Basic
    @Column(name = "id_role")
    private int idRole;
    @Basic
    @Column(name = "lastName")
    private String lastName;
    @Basic
    @Column(name = "firstName")
    private String firstName;
    @Basic
    @Column(name = "dayOfBirth")
    private Date dayOfBirth;
    @Basic
    @Column(name = "inscriptionDate")
    private Date inscriptionDate;
    @Basic
    @Column(name = "vat")
    private String vat;
    @Basic
    @Column(name = "mail")
    private String mail;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "login")
    private String login;
    @Basic
    @Column(name = "active")
    private byte active;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Date getInscriptionDate() {
        return inscriptionDate;
    }

    public void setInscriptionDate(Date inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return idUser == that.idUser && idRole == that.idRole && active == that.active && Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName) && Objects.equals(dayOfBirth, that.dayOfBirth) && Objects.equals(inscriptionDate, that.inscriptionDate) && Objects.equals(vat, that.vat) && Objects.equals(mail, that.mail) && Objects.equals(password, that.password) && Objects.equals(login, that.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, idRole, lastName, firstName, dayOfBirth, inscriptionDate, vat, mail, password, login, active);
    }
}
