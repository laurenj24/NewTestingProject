package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "roles", schema = "stockmanagement", catalog = "")
public class RolesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_role")
    private int idRole;
    @Basic
    @Column(name = "role")
    private String role;

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolesEntity that = (RolesEntity) o;
        return idRole == that.idRole && Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRole, role);
    }
}
