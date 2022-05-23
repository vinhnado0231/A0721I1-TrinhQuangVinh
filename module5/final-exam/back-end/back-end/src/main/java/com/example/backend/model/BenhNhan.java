package com.example.backend.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Set;
import javax.persistence.Entity;

@Entity
public class BenhNhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String idBenhNhan;
    @NotEmpty(message = "Không được để trống")
    private String name;

    @OneToMany(mappedBy = "benhNhan")
    private Set<BenhAn> benhAn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdBenhNhan() {
        return idBenhNhan;
    }

    public void setIdBenhNhan(String idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BenhAn> getBenhAn() {
        return benhAn;
    }

    public void setBenhAns(Set<BenhAn> benhAns) {
        this.benhAn = benhAns;
    }
}
