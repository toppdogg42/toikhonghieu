package com.qlns.qlnsitsol.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@Table(name = "phucap")
public class PhuCap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String tenPhuCap;
    private String ngayPhuCap;
    @ManyToOne
    @JoinColumn(name="luongid")
    @NotFound(action = NotFoundAction.IGNORE)
    private Luong luong;

    public PhuCap() {

    }

    public PhuCap(long id, String tenPhuCap, String ngayPhuCap) {
        this.id = id;
        this.tenPhuCap = tenPhuCap;
        this.ngayPhuCap = ngayPhuCap;
    }

    public Luong getLuong() {
        return luong;
    }

    public void setLuong(Luong luong) {
        this.luong = luong;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenPhuCap() {
        return tenPhuCap;
    }

    public void setTenPhuCap(String tenPhuCap) {
        this.tenPhuCap = tenPhuCap;
    }

    public String getNgayPhuCap() {
        return ngayPhuCap;
    }

    public void setNgayPhuCap(String ngayPhuCap) {
        this.ngayPhuCap = ngayPhuCap;
    }
}
