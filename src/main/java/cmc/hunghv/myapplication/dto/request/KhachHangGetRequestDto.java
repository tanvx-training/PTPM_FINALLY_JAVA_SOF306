package cmc.hunghv.myapplication.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KhachHangGetRequestDto {

  private int page;

  private int size;
}
