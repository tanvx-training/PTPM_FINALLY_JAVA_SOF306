package cmc.hunghv.myapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.Data;

@Data
@Entity
@Table(name = "HangKhachHang")
public class HangKhachHang {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer maHang;

  @Column(length = 50, nullable = false)
  private String tenHang;

  @Column(columnDefinition = "NVARCHAR(MAX)")
  private String moTa;

  @Column(nullable = false)
  private Integer diemToiThieu;

  private Integer trangThai;

  @OneToMany(mappedBy = "hangKhachHang")
  private Set<KhachHang> khachHangs;
}

