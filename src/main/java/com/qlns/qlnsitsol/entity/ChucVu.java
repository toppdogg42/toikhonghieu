//package com.qlns.qlnsitsol.entity;
//
//import org.hibernate.annotations.NotFound;
//import org.hibernate.annotations.NotFoundAction;
//
//import javax.persistence.*;
//import java.util.List;
//import java.util.Set;
//
//@Entity
//@Table(name = "chucvu")
//public class ChucVu {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private  long id;
//    @Column(name = "tenchucvu")
//    private  String tenChucvu;
//    @ManyToOne(optional = false)
//    @JoinColumn(name="phongbanid")
//    @NotFound(action = NotFoundAction.IGNORE)
//    private PhongBan phongBan;
//    @OneToMany(mappedBy = "chucVu", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
//    @NotFound(action = NotFoundAction.IGNORE)
//    private List<NhanVien> nhanViens;
//
//    public ChucVu() {
//    }
//    public ChucVu(long id,String tenChucvu) {
//        this.id = id;
//        this.phongBan = phongBan;
//    }
//    public ChucVu(long id,String tenChucvu,PhongBan phongBan) {
//        this.id = id;
//        this.phongBan = phongBan;
//        this.tenChucvu = tenChucvu;
//    }
//
////    public List<NhanVien> getNhanViens() {
////        return nhanViens;
////    }
//
//    public void setNhanViens(List<NhanVien> nhanViens) {
//        this.nhanViens = nhanViens;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getTenChucvu() {
//        return tenChucvu;
//    }
//
//    public void setTenChucvu(String tenChucvu) {
//        this.tenChucvu = tenChucvu;
//    }
//
//    public PhongBan getPhongBan() {
//        return phongBan;
//    }
//
//    public void setPhongBan(PhongBan phongBan) {
//        this.phongBan = phongBan;
//    }
//}
//
