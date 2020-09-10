package com.qlns.qlnsitsol.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@Table(name = "tamung")
public class TamUng {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "tentamung")
    private String tenTamung;
    @Column(name = "lydo")
    private String lyDo;
    @Column(name = "ngaytamung")
    private String ngayTamUng;
    @ManyToOne
    @JoinColumn(name="luongid")
    @NotFound(action = NotFoundAction.IGNORE)
    private Luong luong;

    public TamUng() {
    }
    public TamUng(long id, String tenTamung, String lyDo, String ngayTamUng) {
        this.id = id;
        this.tenTamung = tenTamung;
        this.lyDo = lyDo;
        this.ngayTamUng = ngayTamUng;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenTamung() {
        return tenTamung;
    }

    public void setTenTamung(String tenTamung) {
        this.tenTamung = tenTamung;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getNgayTamUng() {
        return ngayTamUng;
    }

    public void setNgayTamUng(String ngayTamUng) {
        this.ngayTamUng = ngayTamUng;
    }

    public Luong getLuong() {
        return luong;
    }

    public void setLuong(Luong luong) {
        this.luong = luong;
    }
}
