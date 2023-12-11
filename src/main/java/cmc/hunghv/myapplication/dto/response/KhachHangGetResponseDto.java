package cmc.hunghv.myapplication.dto.response;

import java.time.Instant;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KhachHangGetResponseDto {

  private Long maKhachHang;

  private String tenKhachHang;

  private Instant sinhNhat;

  private String diaChi;

  private String soDienThoai;

  private String email;

  private Boolean gioiTinh;

  private String chungMinhThu;

  private String soCanCuoc;

  private String anhDaiDien;

  private Integer trangThai;

  private Integer diemTichLuy;
}
