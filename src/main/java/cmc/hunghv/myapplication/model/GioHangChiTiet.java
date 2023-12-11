package cmc.hunghv.myapplication.model;

import cmc.hunghv.myapplication.model.id.GioHangChiTietId;
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
@Table(name = "GioHangChiTiet")
@IdClass(GioHangChiTietId.class)
public class GioHangChiTiet {
  @Id
  private UUID maGioHang;

  @Id
  private Long maSanPham;

  private Integer soLuong;

  @Column(columnDefinition = "NVARCHAR(MAX)")
  private String ghiChu;

  private Integer trangThai;

  @ManyToOne
  @MapsId("maGioHang")
  @JoinColumn(name = "MaGioHang")
  private GioHang gioHang;

  @ManyToOne
  @MapsId("maSanPham")
  @JoinColumn(name = "MaSanPham")
  private SanPham sanPham;

}


