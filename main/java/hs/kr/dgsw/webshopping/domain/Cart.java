package hs.kr.dgsw.webshopping.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cart {
    private Long id;
    private String userid;
    private Long productid;
    private int price;
    private int amount;
    private int total;
}