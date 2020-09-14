package com.qlns.qlnsitsol.serviceIplm;

import com.qlns.qlnsitsol.DTO.CreNhanVienDTO;
import com.qlns.qlnsitsol.Service.NhanVienService;
import com.qlns.qlnsitsol.entity.NhanVien;
import com.qlns.qlnsitsol.repository.RepositoryNhanVien;
import com.qlns.qlnsitsol.repository.RepositoryPhongBan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class NhanVienIplm implements NhanVienService {
    @Autowired
    RepositoryNhanVien repositoryNhanVien;
    @Autowired
    RepositoryPhongBan repositoryPhongBan;
    @Autowired
    CreNhanVienDTO creNhanVienDTO;
    @Override
    public List<NhanVien> list() {
        return repositoryNhanVien.findAll();
    }

    @Override
    public Optional<NhanVien> getOne(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<NhanVien> getByName(String s) {
        return Optional.empty();
    }

    @Override
    public void save(NhanVien nv) {

    repositoryNhanVien.save(nv);
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public boolean existsById(long id) {
        return false;
    }

    @Override
    public boolean existsByName(String s) {
        return false;
    }

    @Override
    public Page<NhanVien> page(Pageable pageable) {
        return  repositoryNhanVien.findAll(pageable);
    }
}
