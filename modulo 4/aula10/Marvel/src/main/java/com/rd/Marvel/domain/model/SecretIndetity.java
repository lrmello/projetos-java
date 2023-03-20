package com.rd.Marvel.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "identities")
@Getter @Setter @Builder
@AllArgsConstructor
@NoArgsConstructor
public class SecretIndetity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String realName;

    private String password;

    private String city;

    private int age;
}
