package com.project01.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "documenttypes", schema = "stockmanagement", catalog = "")
public class DocumenttypesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_typeDocument")
    private int idTypeDocument;
    @Basic
    @Column(name = "documentType")
    private String documentType;

    public int getIdTypeDocument() {
        return idTypeDocument;
    }

    public void setIdTypeDocument(int idTypeDocument) {
        this.idTypeDocument = idTypeDocument;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumenttypesEntity that = (DocumenttypesEntity) o;
        return idTypeDocument == that.idTypeDocument && Objects.equals(documentType, that.documentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTypeDocument, documentType);
    }
}
