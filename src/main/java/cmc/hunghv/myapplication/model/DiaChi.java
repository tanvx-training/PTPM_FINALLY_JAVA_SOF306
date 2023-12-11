package cmc.hunghv.myapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Data;

@Data
@Entity
@Table(name = "DiaChi")
public class DiaChi {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID maDiaChi;

  @Column(length = 50)
  private String tenDiaChi;

  @Column(columnDefinition = "NVARCHAR(MAX)")
  private String moTaChiTiet;

  @Column(length = 50)
  private String tinhThanhPho;

  @Column(length = 50)
  private String quanHuyen;

  @Column(length = 50)
  private String phuongXa;

  @Column(length = 50)
  private String duongPho;

  @ManyToOne
  @JoinColumn(name = "KhachHang")
  private KhachHang khachHang;
}

