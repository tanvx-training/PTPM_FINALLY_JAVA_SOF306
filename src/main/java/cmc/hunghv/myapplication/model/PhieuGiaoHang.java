package cmc.hunghv.myapplication.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;
import lombok.Data;

@Data
@Entity
@Table(name = "PhieuGiaoHang")
public class PhieuGiaoHang {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID maPhieuGiao;

  private String nguoiNhan;
  private String sdtNhan;
  private String nguoiGiao;
  private String sdtGiao;

  @Temporal(TemporalType.DATE)
  private Instant ngayGiao;

  @Temporal(TemporalType.DATE)
  private Instant ngayNhan;

  private String nguoiTao;
  private BigDecimal phiGiaoHang;

  @ManyToOne
  @JoinColumn(name = "HoaDonGiao")
  private HoaDon hoaDonGiao;

  @ManyToOne
  @JoinColumn(name = "DiaChiGiao")
  private DiaChi diaChiGiao;

  @Column(columnDefinition = "NVARCHAR(MAX)")
  private String ghiChu;

  private Integer trangThai;

}

