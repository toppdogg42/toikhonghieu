package com.qlns.qlnsitsol.Service;

import com.qlns.qlnsitsol.entity.KhenThuongKl;
import com.qlns.qlnsitsol.entity.PhongBan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface KhenThuongService {
    List<KhenThuongKl> list();
    Optional<KhenThuongKl> getOne(int id);
    Optional<KhenThuongKl> getByName(String s);
    void  save(KhenThuongKl khenThuongKl);
    void delete(int id);
    boolean existsById(int id);
    boolean existsByName(String s);
    Page<KhenThuongKl> page(Pageable pageable);
}
