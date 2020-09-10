package com.qlns.qlnsitsol.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@Table(name = "dieuchinhluong")
public class DieuChinhLuong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "ngaydieuchinhluong")
    private String NgayDieuChinhLuong;
    @Column(name = "luongcu")
    private String LuongCu;
    @Column(name = "luongmoi")
    private String LuongMoi;
    @ManyToOne
    @JoinColumn(name="luongid")
    @NotFound(action = NotFoundAction.IGNORE)
    private Luong  luong;

    public DieuChinhLuong(long id, String ngayDieuChinhLuong, String luongCu, String luongMoi) {
        this.id = id;
        NgayDieuChinhLuong = ngayDieuChinhLuong;
        LuongCu = luongCu;
        LuongMoi = luongMoi;
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

    public String getNgayDieuChinhLuong() {
        return NgayDieuChinhLuong;
    }

    public void setNgayDieuChinhLuong(String ngayDieuChinhLuong) {
        NgayDieuChinhLuong = ngayDieuChinhLuong;
    }

    public String getLuongCu() {
        return LuongCu;
    }

    public void setLuongCu(String luongCu) {
        LuongCu = luongCu;
    }

    public String getLuongMoi() {
        return LuongMoi;
    }

    public void setLuongMoi(String luongMoi) {
        LuongMoi = luongMoi;
    }
}
