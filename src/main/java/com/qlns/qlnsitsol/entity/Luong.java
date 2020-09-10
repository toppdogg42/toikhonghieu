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

    @OneToMany(mappedBy = "luong", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @NotFound(action = NotFoundAction.IGNORE)
    private List<KhenThuongKl> khenThuongKls;
    @OneToMany(mappedBy = "luong", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @NotFound(action = NotFoundAction.IGNORE)
    private List<PhuCap> phuCaps;
    @OneToMany(mappedBy = "luong", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @NotFound(action = NotFoundAction.IGNORE)
    private List<TamUng> tamUngs;
    @OneToMany(mappedBy = "luong", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @NotFound(action = NotFoundAction.IGNORE)
    private List<KyLuat> kyLuats;

    @ManyToOne
    @JoinColumn(name="nhanvienid")
    @NotFound(action = NotFoundAction.IGNORE)
    private NhanVien nhanVien;
    @OneToMany(mappedBy = "luong", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @NotFound(action = NotFoundAction.IGNORE)
    private List<DieuChinhLuong> dieuChinhLuongs;

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

//    public List<KhenThuongKl> getKhenThuongKls() {
//        return khenThuongKls;
//    }

    public void setKhenThuongKls(List<KhenThuongKl> khenThuongKls) {
        this.khenThuongKls = khenThuongKls;
    }

//    public List<PhuCap> getPhuCaps() {
//        return phuCaps;
//    }

    public void setPhuCaps(List<PhuCap> phuCaps) {
        this.phuCaps = phuCaps;
    }

//    public List<TamUng> getTamUngs() {
//        return tamUngs;
//    }

    public void setTamUngs(List<TamUng> tamUngs) {
        this.tamUngs = tamUngs;
    }

//    public List<KyLuat> getKyLuats() {
//        return kyLuats;
//    }

    public void setKyLuats(List<KyLuat> kyLuats) {
        this.kyLuats = kyLuats;
    }

//    public List<DieuChinhLuong> getDieuChinhLuongs() {
//        return dieuChinhLuongs;
//    }

    public void setDieuChinhLuongs(List<DieuChinhLuong> dieuChinhLuongs) {
        this.dieuChinhLuongs = dieuChinhLuongs;
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
