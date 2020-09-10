package com.qlns.qlnsitsol.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "phucap")
public class PhuCap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String tenPhuCap;
    private String ngayPhuCap;
    @OneToMany(mappedBy = "phuCap", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @NotFound(action = NotFoundAction.IGNORE)
    List<Luong> luongs;


    public PhuCap() {

    }

    public PhuCap(long id, String tenPhuCap, String ngayPhuCap) {
        this.id = id;
        this.tenPhuCap = tenPhuCap;
        this.ngayPhuCap = ngayPhuCap;
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
