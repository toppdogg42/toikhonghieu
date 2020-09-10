package com.qlns.qlnsitsol.DTO;

import com.qlns.qlnsitsol.entity.NhanVien;
import com.qlns.qlnsitsol.entity.PhongBan;

public class PhongBanDTO {
    private String TenNV;
    private String TenPB;
    private String chucVu;
    private String ghiChu;
    private String img;
    public PhongBanDTO() {

    }

    public PhongBanDTO(String tenNV, String tenPB, String ghiChu, String img) {
        TenNV = tenNV;
        TenPB = tenPB;
        this.ghiChu = ghiChu;
        this.img = img;
    }
    public PhongBanDTO toDTO(NhanVien nv) {
        PhongBanDTO dto = new PhongBanDTO();
        dto.setTenNV(nv.getTenNhanVien());
        dto.setChucVu(nv.getChuVu());
        dto.setGhiChu(nv.getPhongBan().getGhiChu());
        dto.setImg(nv.getPhongBan().getImg());
        dto.setTenPB(nv.getPhongBan().getTenPhongBan());
        return dto;

    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public String getTenPB() {
        return TenPB;
    }

    public void setTenPB(String tenPB) {
        TenPB = tenPB;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
