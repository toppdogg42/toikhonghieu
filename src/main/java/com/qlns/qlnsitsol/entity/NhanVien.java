package com.qlns.qlnsitsol.entity;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  long id;
    @Column(name = "tennhanvien")
    private String tenNhanVien;
    @Column(name = "ngaysinh")
    private String ngaySinh;
    @Column(name = "gioitinh")
    private Boolean gioiTinh;
    @Column(name = "diachi")
    private String diaChi;
    @Column(name = "socmnnd")
    private String soCmnnd;
    @Column(name = "dienthoai")
    private String dienThoai;
    @Column(name = "chucvu")
    private String chuVu;
    private String email;
    private String img;
    @Column(name = "isaction")
    private Boolean action;
//    @ManyToOne
//    @JoinColumn(name="chucvuid")
//    @NotFound(action = NotFoundAction.IGNORE)
//    private ChucVu chucVu;

    @OneToMany(mappedBy = "nhanVien", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @NotFound(action = NotFoundAction.IGNORE)
    private List<Luong> luongs;
    @ManyToOne
    @JoinColumn(name="phongbanid")
    @NotFound(action = NotFoundAction.IGNORE)
    private PhongBan phongBan;

    @OneToMany(mappedBy = "nhanVien", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @NotFound(action = NotFoundAction.IGNORE)
    private List<DiemDanh> diemDanh;

    public NhanVien() {
    }
    public NhanVien(long id, String tenNhanVien, String ngaySinh, Boolean gioiTinh, String diaChi, String soCmnnd, String dienThoai, String email,String img,String chuVu, Boolean action) {
        this.id = id;
        this.tenNhanVien = tenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soCmnnd = soCmnnd;
        this.dienThoai = dienThoai;
        this.email = email;
        this.img = img;
        this.chuVu = chuVu;
        this.action = action;
    }

    public String getChuVu() {
        return chuVu;
    }

    public void setChuVu(String chuVu) {
        this.chuVu = chuVu;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

//    public List<Luong> getLuongs() {
//        return luongs;
//    }

    public List<Luong> getLuongs() {
        return luongs;
    }

    public List<DiemDanh> getDiemDanh() {
        return diemDanh;
    }

    public void setDiemDanh(List<DiemDanh> diemDanh) {
        this.diemDanh = diemDanh;
    }

    public void setLuongs(List<Luong> luongs) {
        this.luongs = luongs;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

//    public ChucVu getChucVu() {
//        return chucVu;
//    }
//
//    public void setChucVu(ChucVu chucVu) {
//        this.chucVu = chucVu;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoCmnnd() {
        return soCmnnd;
    }

    public void setSoCmnnd(String soCmnnd) {
        this.soCmnnd = soCmnnd;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAction() {
        return action;
    }

    public void setAction(Boolean action) {
        this.action = action;
    }
}
