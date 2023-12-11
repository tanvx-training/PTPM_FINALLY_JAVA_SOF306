package cmc.hunghv.myapplication.model.id;

import java.io.Serializable;
import java.util.UUID;
import lombok.Data;

@Data
public class GioHangChiTietId implements Serializable {
  private UUID maGioHang;
  private Long maSanPham;
}
