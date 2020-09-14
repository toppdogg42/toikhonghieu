package com.qlns.qlnsitsol.Controller;

import com.qlns.qlnsitsol.DTO.CreNhanVienDTO;
import com.qlns.qlnsitsol.DTO.Message;
import com.qlns.qlnsitsol.DTO.NhanVienDTO;
import com.qlns.qlnsitsol.Service.NhanVienService;
import com.qlns.qlnsitsol.entity.NhanVien;
import com.qlns.qlnsitsol.entity.PhongBan;
import com.qlns.qlnsitsol.messager.Messager;
import com.qlns.qlnsitsol.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/nhanvien")
public class ControllerNhanVien {
    @Autowired
    NhanVienService nhanVienService;
    @Autowired
    RepositoryNhanVien repo;
    @Autowired
    RepositoryDiemDanh repositoryDiemDanh;
    @Autowired
    RepositoryLuong repositoryLuong;
    @Autowired
    RepositoryKhenThuong repositoryKhenThuong;
    @Autowired
    RepositoryPhongBan repositoryPhongBan;

    CreNhanVienDTO creNhanVienDTO;
    @GetMapping()
    public ResponseEntity<Page<NhanVien>> pageResponseEntity(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "name") String order,
            @RequestParam(defaultValue = "true") boolean asc
    ){
        Page<NhanVien> pages = nhanVienService.page(
                PageRequest.of(page, size, Sort.by(order)));
        if(!asc)
            pages = nhanVienService.page(
                    PageRequest.of(page, size, Sort.by(order).descending()));

        return new ResponseEntity<Page<NhanVien>>(pages, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<NhanVienDTO>> listResponseEntity(){
        List<NhanVien> nv = repo.getAllByChuVuLikeAndActionAndPhongBan_Action("giam đốc",true,true);
        NhanVienDTO dto = new NhanVienDTO();
        nv.stream().map(dto::toDTO).collect(Collectors.toList());
        if (nv.isEmpty()){
            return new  ResponseEntity(new Messager("Khong ton tai"), HttpStatus.NOT_FOUND);
        }
        return new  ResponseEntity(nv.stream().map(dto::toDTO).collect(Collectors.toList()), HttpStatus.OK);
    }
//    @GetMapping("/listLuong")
//    public ResponseEntity<Luong> listResponseEntity1(){
////        List<NhanVien> nv = repo.getAllByChuVuLikeAndActionAndPhongBan_Action("giam đốc",true,true);
////        NhanVienDTO dto = new NhanVienDTO();
////        nv.stream().map(dto::toDTO).collect(Collectors.toList());
////        if (nv.isEmpty()){
////            return new  ResponseEntity(new Messager("Khong ton tai"), HttpStatus.NOT_FOUND);
////        }
////        List<DiemDanh> list = repositoryDiemDanh.getAllByDilamAndNhanVienIdAndDateLike(true,1,"%9/2020%");
////        Optional<Luong> luong = repositoryLuong.findByNhanVienIdAndThangAndNam(1,"2","2");
//        Optional<KhenThuongKl> kt = repositoryKhenThuong.findByLuongId(luong.get().getId());
//        return new  ResponseEntity(luong, HttpStatus.OK);
//    }
    @PostMapping("/newNhanVien")
    public ResponseEntity<?> create(@RequestBody CreNhanVienDTO dto){
        PhongBan pb = repositoryPhongBan.findById(dto.getPhongbanid()).get();
        NhanVien nv =creNhanVienDTO.toEntity(dto);
        nv.setPhongBan(pb);
        nhanVienService.save(nv);
        return new ResponseEntity(new Message("Them nhan vien moi thanh cong"), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")Long id, @RequestBody CreNhanVienDTO dto){
        if(!nhanVienService.existsById(id)) {
            return new ResponseEntity(new Message("no exists"), HttpStatus.NOT_FOUND);
        }
        PhongBan pb = repositoryPhongBan.findById(dto.getPhongbanid()).get();
        NhanVien nv = nhanVienService.getOne(id).get();
        nv.setAction(dto.getAction());
        nv.setTenNhanVien(dto.getTenNhanVien());
        nv.setNgaySinh(dto.getNgaySinh());
        nv.setGioiTinh(dto.getGioiTinh());
        nv.setDiaChi(dto.getDiaChi());
        nv.setSoCmnnd(dto.getSoCmnnd());
        nv.setDienThoai(dto.getDienThoai());
        nv.setChuVu(dto.getChuVu());
        nv.setEmail(dto.getEmail());
        nv.setImg(dto.getImg());
        nv.setPhongBan(pb);
        nhanVienService.save(nv);
        return new ResponseEntity(new Message("Cap nhat thanh cong"), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        if(!nhanVienService.existsById(id)) {
            return new ResponseEntity(new Message("no exists"), HttpStatus.NOT_FOUND);
        }
        NhanVien nv = nhanVienService.getOne(id).get();
        nv.setAction(false);
        nhanVienService.save(nv);
        return new ResponseEntity(new Message("Xoa thanh cong"), HttpStatus.OK);
    }
}
