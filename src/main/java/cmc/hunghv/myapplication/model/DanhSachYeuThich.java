package cmc.hunghv.myapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.Data;

@Data
@Entity
@Table(name = "DanhSachYeuThich")
public class DanhSachYeuThich {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID maDanhSach;

  @Temporal(TemporalType.DATE)
  private Instant ngayTao;

  @Temporal(TemporalType.DATE)
  private Instant ngayCapNhap;

  @ManyToOne
  @JoinColumn(name = "NguoiSoHuu")
  private KhachHang nguoiSoHuu;

  @Column(columnDefinition = "NVARCHAR(MAX)")
  private String ghiChu;

  private Integer trangThai;

  @OneToMany(mappedBy = "danhSachYeuThich")
  private Set<YeuThichChiTiet> yeuThichChiTiets;

  // Constructors, Getters, Setters
}

