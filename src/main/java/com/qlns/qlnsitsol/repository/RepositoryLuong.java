package com.qlns.qlnsitsol.repository;

import com.qlns.qlnsitsol.entity.Luong;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RepositoryLuong extends JpaRepository<Luong,Long> {

    Optional<Luong> findByNhanVienIdAndThangAndNam(long id, String thang, String nam);
}
