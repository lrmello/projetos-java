package com.rd.Marvel.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "superheroes")
@Getter @Setter @Builder @AllArgsConstructor @NoArgsConstructor
public class SuperHero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private SecretIndetity secretIndetity;

}
