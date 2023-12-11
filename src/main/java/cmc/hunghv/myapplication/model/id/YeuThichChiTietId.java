package cmc.hunghv.myapplication.model.id;

import java.io.Serializable;
import java.util.UUID;
import lombok.Data;

@Data
public class YeuThichChiTietId implements Serializable {
  private UUID maDanhSach;
  private Long maSanPham;
}
