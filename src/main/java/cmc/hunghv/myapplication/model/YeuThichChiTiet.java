package cmc.hunghv.myapplication.model;

import cmc.hunghv.myapplication.model.id.YeuThichChiTietId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Data;

@Data
@Entity
@Table(name = "YeuThichChiTiet")
@IdClass(YeuThichChiTietId.class)
public class YeuThichChiTiet {
  @Id
  private UUID maDanhSach;

  @Id
  private Long maSanPham;

  @Column(columnDefinition = "NVARCHAR(MAX)")
  private String ghiChu;

  private Integer trangThai;

  @ManyToOne
  @MapsId("maDanhSach")
  @JoinColumn(name = "MaDanhSach")
  private DanhSachYeuThich danhSachYeuThich;

  @ManyToOne
  @MapsId("maSanPham")
  @JoinColumn(name = "MaSanPham")
  private SanPham sanPham;
}


