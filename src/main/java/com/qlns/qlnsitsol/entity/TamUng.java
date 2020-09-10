package com.qlns.qlnsitsol.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(mappedBy = "tamUng", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @NotFound(action = NotFoundAction.IGNORE)
    List<Luong> luongs;


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

}
