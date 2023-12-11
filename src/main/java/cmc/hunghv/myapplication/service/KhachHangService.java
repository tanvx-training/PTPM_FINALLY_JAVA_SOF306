package cmc.hunghv.myapplication.service;

import cmc.hunghv.myapplication.dto.request.KhachHangPostRequestDto;
import cmc.hunghv.myapplication.dto.response.KhachHangGetResponseDto;
import cmc.hunghv.myapplication.dto.response.KhachHangPostResponseDto;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface KhachHangService {

  List<KhachHangGetResponseDto> findAll(Pageable pageable);

  KhachHangPostResponseDto create(KhachHangPostRequestDto requestDto);

  void delete(Long maKhachHang);
}
