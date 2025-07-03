package bc.bcgatewayservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class TokenDto {
    private String token;
}