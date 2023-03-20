package com.rd.Marvel.domain.dto.request;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SecretIndetityDto {
    private String name;
    private String realName;

    private String password;

    private String city;

    private int age;
}
