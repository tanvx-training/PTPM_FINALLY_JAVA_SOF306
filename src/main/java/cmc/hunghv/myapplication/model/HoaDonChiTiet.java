package cmc.hunghv.myapplication.model;

import cmc.hunghv.myapplication.model.id.HoaDonChiTietId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Entity
@Table(name = "HoaDonChiTiet")
@IdClass(HoaDonChiTietId.class)
public class HoaDonChiTiet {
  @Id
  private Long maHoaDon;

  @Id
  private Long maSanPham;

  private Integer soLuong;
  private BigDecimal donGia;

  @Column(columnDefinition = "NVARCHAR(MAX)")
  private String ghiChu;

  private Integer trangThai;

  @ManyToOne
  @MapsId("maHoaDon")
  @JoinColumn(name = "MaHoaDon")
  private HoaDon hoaDon;

  @ManyToOne
  @MapsId("maSanPham")
  @JoinColumn(name = "MaSanPham")
  private SanPham sanPham;
}


