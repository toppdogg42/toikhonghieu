package com.qlns.qlnsitsol.repository;

import com.qlns.qlnsitsol.entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
import java.util.Optional;

public interface RepositoryPhongBan extends JpaRepository<PhongBan,Long> {
       Optional<PhongBan> findByTenPhongBan(String s);
    Optional<PhongBan> findById(long id);
        Boolean existsByTenPhongBan(String s);

        @Query(nativeQuery = true, value = "select*from phongban join chucvu on phongban.id = chucvu.phongbanid join nhanvien on nhanvien.chucvuid = chucvu.id where chucvu.tenchucvu like 'giam doc'")
        List<PhongBan> listPhongBan();
}
