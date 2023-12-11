package cmc.hunghv.myapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.Instant;
import lombok.Data;

@Data
@Entity
@Table(name = "TheThanhVien")
public class TheThanhVien {
  @Id
  @Column(length = 50)
  private String maThe;

  @Column(length = 10)
  private String mauThe;

  @Column(length = 10)
  private String loaiThe;

  @Temporal(TemporalType.DATE)
  private Instant ngayPhatHanh;

  @Temporal(TemporalType.DATE)
  private Instant ngayHuy;

  private Integer trangThai;

  @ManyToOne
  @JoinColumn(name = "NguoiSoHuu")
  private KhachHang nguoiSoHuu;
}

