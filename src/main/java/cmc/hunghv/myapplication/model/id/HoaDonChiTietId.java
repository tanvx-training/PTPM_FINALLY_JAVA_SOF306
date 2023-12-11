package cmc.hunghv.myapplication.model.id;

import java.io.Serializable;
import lombok.Data;

@Data
public class HoaDonChiTietId implements Serializable {
  private Long maHoaDon;
  private Long maSanPham;
}
