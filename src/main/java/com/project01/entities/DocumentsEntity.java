package com.project01.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "documents", schema = "stockmanagement", catalog = "")
public class DocumentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_document")
    private int idDocument;
    @Basic
    @Column(name = "id_documentType")
    private int idDocumentType;
    @Basic
    @Column(name = "numero")
    private int numero;
    @Basic
    @Column(name = "dateDocument")
    private Date dateDocument;

    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public int getIdDocumentType() {
        return idDocumentType;
    }

    public void setIdDocumentType(int idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDateDocument() {
        return dateDocument;
    }

    public void setDateDocument(Date dateDocument) {
        this.dateDocument = dateDocument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentsEntity that = (DocumentsEntity) o;
        return idDocument == that.idDocument && idDocumentType == that.idDocumentType && numero == that.numero && Objects.equals(dateDocument, that.dateDocument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDocument, idDocumentType, numero, dateDocument);
    }
}
