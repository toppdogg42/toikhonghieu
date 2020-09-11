package com.qlns.qlnsitsol.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Entity
public class Luong {
    @Id
    private  String date;
    @Column(name = "luongcoban")
    private String LuongCoBan;
    @Column(name = "ngaycong")
    private String NgayCong;
    @Column(name = "ghitru")
    private String GhiTru;

    @ManyToOne
    @JoinColumn(name="kyluatid")
    @NotFound(action = NotFoundAction.IGNORE)
    private KyLuat kyLuat;
    @ManyToOne
    @JoinColumn(name="nhanvienid")
    @NotFound(action = NotFoundAction.IGNORE)
    private NhanVien nhanVien;
    @ManyToOne
    @JoinColumn(name="hesoluongid")
    @NotFound(action = NotFoundAction.IGNORE)
    private HeSoLuong heSoLuong;
    @ManyToOne
    @JoinColumn(name="khenthuongid")
    @NotFound(action = NotFoundAction.IGNORE)
    private KhenThuongKl khenThuongKl;
    @ManyToOne
    @JoinColumn(name="tamungid")
    @NotFound(action = NotFoundAction.IGNORE)
    private TamUng tamUng;
    @ManyToOne
    @JoinColumn(name="phucapid")
    @NotFound(action = NotFoundAction.IGNORE)
    private PhuCap phuCap;

    public Luong() {

    }

    public Luong(String date, String luongCoBan, String ngayCong, String ghiTru, KyLuat kyLuat, NhanVien nhanVien, HeSoLuong heSoLuong, KhenThuongKl khenThuongKl, TamUng tamUng, PhuCap phuCap) {
        this.date = date;
        LuongCoBan = luongCoBan;
        NgayCong = ngayCong;
        GhiTru = ghiTru;
        this.kyLuat = kyLuat;
        this.nhanVien = nhanVien;
        this.heSoLuong = heSoLuong;
        this.khenThuongKl = khenThuongKl;
        this.tamUng = tamUng;
        this.phuCap = phuCap;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public KyLuat getKyLuat() {
        return kyLuat;
    }

    public void setKyLuat(KyLuat kyLuat) {
        this.kyLuat = kyLuat;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public HeSoLuong getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(HeSoLuong heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public KhenThuongKl getKhenThuongKl() {
        return khenThuongKl;
    }

    public void setKhenThuongKl(KhenThuongKl khenThuongKl) {
        this.khenThuongKl = khenThuongKl;
    }

    public TamUng getTamUng() {
        return tamUng;
    }

    public void setTamUng(TamUng tamUng) {
        this.tamUng = tamUng;
    }

    public PhuCap getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(PhuCap phuCap) {
        this.phuCap = phuCap;
    }

    public String getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(String luongCoBan) {
        LuongCoBan = luongCoBan;
    }


    public String getNgayCong() {
        return NgayCong;
    }

    public void setNgayCong(String ngayCong) {
        NgayCong = ngayCong;
    }

    public String getGhiTru() {
        return GhiTru;
    }

    public void setGhiTru(String ghiTru) {
        GhiTru = ghiTru;
    }

//    public NhanVien getNhanVien() {
//        return nhanVien;
//    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
}
