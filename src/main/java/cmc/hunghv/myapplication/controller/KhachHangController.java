package cmc.hunghv.myapplication.controller;

import cmc.hunghv.myapplication.dto.request.KhachHangPostRequestDto;
import cmc.hunghv.myapplication.dto.response.KhachHangGetResponseDto;
import cmc.hunghv.myapplication.dto.response.KhachHangPostResponseDto;
import cmc.hunghv.myapplication.service.KhachHangService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/khachhang")
public class KhachHangController {

  @Autowired
  private KhachHangService khachHangService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<KhachHangGetResponseDto> findAll(@RequestParam(value = "page", defaultValue = "1") int page,
      @RequestParam(value = "size", defaultValue = "5") int size) {

    Pageable pageable = PageRequest.of(--page, size);

    return khachHangService.findAll(pageable);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public KhachHangPostResponseDto create(@RequestBody KhachHangPostRequestDto requestDto) {

    return khachHangService.create(requestDto);
  }

  @DeleteMapping("{maKhachHang}")
  @ResponseStatus(HttpStatus.OK)
  public void delete(@PathVariable("maKhachHang") Long maKhachHang) {
    khachHangService.delete(maKhachHang);
  }
}
