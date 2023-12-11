package cmc.hunghv.myapplication.dto.request;

import jakarta.validation.constraints.NotNull;
import java.time.Instant;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KhachHangPostRequestDto {

  @NotNull
  private String tenKhachHang;
  @NotNull
  private Instant sinhNhat;
  @NotNull
  private String diaChi;
  @NotNull
  private String soDienThoai;
  @NotNull
  private String email;
  @NotNull
  private Boolean gioiTinh;
  @NotNull
  private String chungMinhThu;
  @NotNull
  private String soCanCuoc;
  @NotNull
  private String anhDaiDien;
  @NotNull
  private Integer trangThai;
  @NotNull
  private Integer diemTichLuy;
}
