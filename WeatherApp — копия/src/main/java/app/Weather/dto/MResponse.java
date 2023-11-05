package app.Weather.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MResponse {
    private String status;
    private String response;

}
