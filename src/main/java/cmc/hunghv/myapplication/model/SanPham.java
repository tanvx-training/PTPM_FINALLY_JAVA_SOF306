package cmc.hunghv.myapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Entity
@Table(name = "SanPham")
public class SanPham {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long maSanPham;

  @Column(length = 100, nullable = false)
  private String tenSanPham;

  @Column(length = 100)
  private String chatLieu;

  private BigDecimal giaHienHanh;
  private Integer soLuongTon;

  @Column(columnDefinition = "NVARCHAR(MAX)")
  private String moTa;

  @Column(length = 50)
  private String loaiSanPham;

  @Column(length = 20)
  private String mauSac;

  @Column(length = 20)
  private String nhaSanXuat;

  private Integer trangThai;

}

