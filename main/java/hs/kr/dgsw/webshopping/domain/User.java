package hs.kr.dgsw.webshopping.domain;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private Long id;
    private  String account;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String username;
    private String tel;
    private String phone;
    private String zipcode;
    private String address;
    private String email;
    private LocalDateTime created;
    private LocalDateTime updated;
}