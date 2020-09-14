package com.qlns.qlnsitsol.repository;

import com.qlns.qlnsitsol.entity.DiemDanh;
import com.qlns.qlnsitsol.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RepositoryDiemDanh extends JpaRepository<DiemDanh,Long> {
//    Optional<DiemDanh> countByIdAndNhanVien_IdAndDateLikeAndDilam (String s,String date,boolean bl);
   @Query(nativeQuery = true, value = "select  distinct(nhanvienid),sum(dilam) as \"dilam\" from qlns.diemdanh where date like '%09/2020%' and dilam = 1 group by nhanvienid ")
   List<Object[]> getDistinctByNhanVienIdAnd(boolean bl,long id, String date);
}
