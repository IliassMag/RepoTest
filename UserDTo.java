package com.example.mapstructspring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTo {
    private Long id;
    private String firstName;
    private String lastName;
    private String login;
    private String token;
}
