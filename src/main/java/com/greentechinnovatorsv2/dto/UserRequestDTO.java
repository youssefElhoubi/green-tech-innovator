package com.greentechinnovatorsv2.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDTO {
    private String email;
    private String password;
}
