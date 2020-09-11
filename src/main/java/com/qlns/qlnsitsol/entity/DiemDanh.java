package com.qlns.qlnsitsol.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity

@Table(name = "diemdanh")
public class DiemDanh {
    @Id
    @Column(name = "date_id")
    private String date;
    private boolean dilam;
    @ManyToOne
    @PrimaryKeyJoinColumn
    @JoinColumn(name ="nhavienid",referencedColumnName = "id")
    @NotFound(action = NotFoundAction.IGNORE)
    private NhanVien nhanVien;

    public DiemDanh( String date, boolean dilam, NhanVien nhanVien) {
        this.date = date;
        this.dilam = dilam;
        this.nhanVien = nhanVien;
    }
    public DiemDanh() {

    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isDilam() {
        return dilam;
    }

    public void setDilam(boolean dilam) {
        this.dilam = dilam;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
}
