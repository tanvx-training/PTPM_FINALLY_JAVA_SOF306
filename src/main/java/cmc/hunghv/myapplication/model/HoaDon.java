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
import lombok.Data;

@Data
@Entity
@Table(name = "HoaDon")
public class HoaDon {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long maHoaDon;

  @Temporal(TemporalType.DATE)
  private Instant ngayLap;

  @Column(length = 50)
  private String nguoiLap;

  @Column(columnDefinition = "NVARCHAR(MAX)")
  private String ghiChu;

  @Temporal(TemporalType.DATE)
  private Instant ngayThanhToan;

  private Integer trangThai;

  @ManyToOne
  @JoinColumn(name = "NguoiMua")
  private KhachHang nguoiMua;
}

