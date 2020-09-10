//package com.qlns.qlnsitsol.serviceIplm;
//
//import com.qlns.qlnsitsol.Service.ChucVuService;
//import com.qlns.qlnsitsol.entity.ChucVu;
//import com.qlns.qlnsitsol.repository.RepositoryChuVu;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//@Service
//public class ChucVuIplm implements ChucVuService {
//    @Autowired
//    RepositoryChuVu repositoryChuVu;
//
//    @Override
//    public List<ChucVu> list() {
//        return repositoryChuVu.findAll();
//    }
//
//    @Override
//    public Optional<ChucVu> getOne(long id) {
//        return repositoryChuVu.findById(id);
//    }
//
//    @Override
//    public Optional<ChucVu> getByName(String s) {
//        return repositoryChuVu.findByTenChucvu(s);
//    }
//
//    @Override
//    public void save(ChucVu chucVu) {
//        repositoryChuVu.save( chucVu);
//
//    }
//
//    @Override
//    public void delete(long id) {
//        repositoryChuVu.deleteById(id);
//
//    }
//
//    @Override
//    public boolean existsById(long id) {
//        return repositoryChuVu.existsById(id);
//    }
//
//    @Override
//    public boolean existsByName(String s) {
//        return repositoryChuVu.existsByTenChucvu(s);
//    }
//
//    @Override
//    public Page<ChucVu> page(Pageable pageable) {
//        return repositoryChuVu.findAll(pageable);
//    }
//}
