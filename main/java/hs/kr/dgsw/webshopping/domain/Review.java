package hs.kr.dgsw.webshopping.domain;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Review {
    private Long id;
    private Long productid;
    private Long userid;
    private String content;
    private LocalDateTime created;
    private LocalDateTime modified;
}