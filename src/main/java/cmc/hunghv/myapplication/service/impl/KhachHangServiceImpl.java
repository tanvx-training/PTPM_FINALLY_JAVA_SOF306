package cmc.hunghv.myapplication.service.impl;

import cmc.hunghv.myapplication.dto.request.KhachHangPostRequestDto;
import cmc.hunghv.myapplication.dto.response.KhachHangGetResponseDto;
import cmc.hunghv.myapplication.dto.response.KhachHangPostResponseDto;
import cmc.hunghv.myapplication.model.KhachHang;
import cmc.hunghv.myapplication.repository.KhachHangRepository;
import cmc.hunghv.myapplication.service.KhachHangService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class KhachHangServiceImpl implements KhachHangService {

  @Autowired
  private KhachHangRepository khachHangRepository;

  @Override
  public List<KhachHangGetResponseDto> findAll(Pageable pageable) {
    Page<KhachHang> page = khachHangRepository.findAll(pageable);

    List<KhachHang> list = page.getContent();

    if(list.isEmpty()) {
      return new ArrayList<>();
    }

    return list.stream()
        .map(o -> KhachHangGetResponseDto.builder()
            .maKhachHang(o.getMaKhachHang())
            .tenKhachHang(o.getTenKhachHang())
            .sinhNhat(o.getSinhNhat())
            .diaChi(o.getDiaChi())
            .soDienThoai(o.getSoDienThoai())
            .email(o.getEmail())
            .gioiTinh(o.getGioiTinh())
            .chungMinhThu(o.getChungMinhThu())
            .soCanCuoc(o.getSoCanCuoc())
            .anhDaiDien(o.getAnhDaiDien())
            .trangThai(o.getTrangThai())
            .diemTichLuy(o.getDiemTichLuy())
            .build()).toList();
  }

  @Override
  public KhachHangPostResponseDto create(KhachHangPostRequestDto requestDto) {
    KhachHang khachHang = KhachHang.builder()
        .tenKhachHang(requestDto.getTenKhachHang())
        .sinhNhat(requestDto.getSinhNhat())
        .diaChi(requestDto.getDiaChi())
        .soDienThoai(requestDto.getSoDienThoai())
        .email(requestDto.getEmail())
        .gioiTinh(requestDto.getGioiTinh())
        .chungMinhThu(requestDto.getChungMinhThu())
        .soCanCuoc(requestDto.getSoCanCuoc())
        .anhDaiDien(requestDto.getAnhDaiDien())
        .trangThai(requestDto.getTrangThai())
        .diemTichLuy(requestDto.getDiemTichLuy())
        .build();
    khachHangRepository.save(khachHang);
    return KhachHangPostResponseDto.builder()
        .maKhachHang(khachHang.getMaKhachHang())
        .build();
  }

  @Override
  public void delete(Long maKhachHang) {
    Optional<KhachHang> optional = khachHangRepository.findById(maKhachHang);
    if(optional.isEmpty()) {
      throw new RuntimeException("Khách hàng không tồn tại");
    }

    khachHangRepository.delete(optional.get());
  }

}
