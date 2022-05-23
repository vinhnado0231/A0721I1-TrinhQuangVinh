package com.example.backend.model;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.persistence.Entity;

@Entity
public class BenhAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Không được để trống")
    private String idBenhAn;

    private String dateStart;

    private String dateEnd;

    @NotEmpty(message = "Không được để trống")
    private String liDoNhapVien;

    @NotEmpty(message = "Không được để trống")
    private String ppDieuTri;

    @NotEmpty(message = "Không được để trống")
    private String bacSi;

    @ManyToOne
    @JoinColumn(name = "idBenhNhan" , nullable = false)
    private BenhNhan benhNhan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdBenhAn() {
        return idBenhAn;
    }

    public void setIdBenhAn(String idBenhAn) {
        this.idBenhAn = idBenhAn;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getLiDoNhapVien() {
        return liDoNhapVien;
    }

    public void setLiDoNhapVien(String liDoNhapVien) {
        this.liDoNhapVien = liDoNhapVien;
    }

    public String getPpDieuTri() {
        return ppDieuTri;
    }

    public void setPpDieuTri(String ppDieuTri) {
        this.ppDieuTri = ppDieuTri;
    }

    public String getBacSi() {
        return bacSi;
    }

    public void setBacSi(String bacSi) {
        this.bacSi = bacSi;
    }
}
