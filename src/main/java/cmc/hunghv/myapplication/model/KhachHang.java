package cmc.hunghv.myapplication.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "KhachHang")
public class KhachHang {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long maKhachHang;

  @Column(length = 50, nullable = false)
  private String tenKhachHang;

  @Column(nullable = false)
  @Temporal(TemporalType.DATE)
  private Instant sinhNhat;

  @Column(columnDefinition = "NVARCHAR(MAX)")
  private String diaChi;

  @Column(length = 15)
  private String soDienThoai;

  @Column(length = 50)
  private String email;

  private Boolean gioiTinh;

  @Column(length = 15)
  private String chungMinhThu;

  @Column(length = 15)
  private String soCanCuoc;

  @Column(length = 50)
  private String anhDaiDien;

  private Integer trangThai;
  private Integer diemTichLuy = 0;

  @ManyToOne
  @JsonIgnore
  @JoinColumn(name = "HangKhachHang")
  private HangKhachHang hangKhachHang;

  @ManyToOne
  @JsonIgnore
  @JoinColumn(name = "NguoiGioiThieu")
  private KhachHang nguoiGioiThieu;

  @JsonIgnore
  @OneToMany(mappedBy = "nguoiGioiThieu", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<KhachHang> gioiThieuKhachHangs;

  @JsonIgnore
  @OneToMany(mappedBy = "nguoiSoHuu", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<TheThanhVien> theThanhViens;
}

