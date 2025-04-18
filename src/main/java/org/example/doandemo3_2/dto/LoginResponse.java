package org.example.doandemo3_2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LoginResponse {
    private String errorCode;
    private String message;
    private String token;
    private String role;
}
