package io.github.joaopaulu.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false, length=150)
    private String nome;

    @Column(nullable=false, length=11)
    private String cpf;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;
}
