package com.qlns.qlnsitsol.Service;

import com.qlns.qlnsitsol.entity.DieuChinhLuong;
import com.qlns.qlnsitsol.entity.PhongBan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface DieuChinhService {
    List<DieuChinhLuong> list();
    Optional<DieuChinhLuong> getOne(int id);
    Optional<DieuChinhLuong> getByName(String s);
    void  save(DieuChinhLuong dieuChinhLuong);
    void delete(int id);
    boolean existsById(int id);
    boolean existsByName(String s);
    Page<DieuChinhLuong> page(Pageable pageable);
}
