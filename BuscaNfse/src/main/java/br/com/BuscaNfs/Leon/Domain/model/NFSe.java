package br.com.BuscaNfs.Leon.Domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "tipoNF")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class NFSe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;



}
