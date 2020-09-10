package com.qlns.qlnsitsol.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Entity
public class Luong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "luongcoban")
    private String LuongCoBan;
    @Column(name = "khoancong")
    private String KhoanCong;
    @Column(name = "khoantru")
    private String KhoanTru;
    @Column(name = "ngaycong")
    private String NgayCong;
    @Column(name = "ghitru")
    private String GhiTru;
    private  String thang;
    private  String nam;

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

    public Luong(long id, String luongCoBan, String khoanCong, String khoanTru, String ngayCong, String ghiTru, String thang, String nam) {
        this.id = id;
        LuongCoBan = luongCoBan;
        KhoanCong = khoanCong;
        KhoanTru = khoanTru;
        NgayCong = ngayCong;
        GhiTru = ghiTru;
        this.thang = thang;
        this.nam = nam;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(String luongCoBan) {
        LuongCoBan = luongCoBan;
    }

    public String getKhoanCong() {
        return KhoanCong;
    }

    public void setKhoanCong(String khoanCong) {
        KhoanCong = khoanCong;
    }

    public String getKhoanTru() {
        return KhoanTru;
    }

    public void setKhoanTru(String khoanTru) {
        KhoanTru = khoanTru;
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

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

//    public NhanVien getNhanVien() {
//        return nhanVien;
//    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
}
