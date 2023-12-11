package cmc.hunghv.myapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "PhieuGiamGia")
public class PhieuGiamGia {
  @Id
  @Column(length = 10)
  private String maPhieu;

  @Column(length = 20)
  private String tenPhieu;

  @Temporal(TemporalType.DATE)
  private Instant ngayBatDau;

  @Temporal(TemporalType.DATE)
  private Instant ngayKetThuc;

  private BigDecimal giaTriGiam;
  private BigDecimal giaTriGiamToiDa;

  private Boolean hinhThucGiam;
  private Integer trangThai;

  @ManyToOne
  @JoinColumn(name = "NguoiSoHuu")
  private KhachHang nguoiSoHuu;
}

