package com.qlns.qlnsitsol.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@Table(name = "kyluat")
public class KyLuat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    @Column(name = "hinhthuckyluat")
    private String hinhthuckyluat;
    @Column(name = "lydo")
    private String lyDo;
    @Column(name = "tienphat")
    private String tienPhat;
    @Column(name = "ngayphat")
    private  String ngayPhat;
    @ManyToOne
    @JoinColumn(name="luongid")
    @NotFound(action = NotFoundAction.IGNORE)
    private Luong luong;

    public KyLuat() {
    }

    public KyLuat(long id, String hinhthuckyluat, String lyDo, String tienPhat, String ngayPhat, Luong luong) {
        this.id = id;
        this.hinhthuckyluat = hinhthuckyluat;
        this.lyDo = lyDo;
        this.tienPhat = tienPhat;
        this.ngayPhat = ngayPhat;
        this.luong = luong;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHinhthuckyluat() {
        return hinhthuckyluat;
    }

    public void setHinhthuckyluat(String hinhthuckyluat) {
        this.hinhthuckyluat = hinhthuckyluat;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(String tienPhat) {
        this.tienPhat = tienPhat;
    }

    public String getNgayPhat() {
        return ngayPhat;
    }

    public void setNgayPhat(String ngayPhat) {
        this.ngayPhat = ngayPhat;
    }

    public Luong getLuong() {
        return luong;
    }

    public void setLuong(Luong luong) {
        this.luong = luong;
    }
}
