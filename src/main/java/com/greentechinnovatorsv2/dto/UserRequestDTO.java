package com.greentechinnovatorsv2.dto;

import com.greentechinnovatorsv2.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDTO {
    @Email
    @NotEmpty(message = "email must not be empty")
    private String email;
    @NotEmpty(message = "password must not be empty")
    private String password;
    private Role role;
}
