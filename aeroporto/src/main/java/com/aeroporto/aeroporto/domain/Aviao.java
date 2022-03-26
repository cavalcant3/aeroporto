package com.aeroporto.aeroporto.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Aviao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String identificacao;
    private String modelo;
    private int qtdTurbinas;
    private int capacPassageiros;
    private double capacCarga;

//??????????????
    @ManyToOne
    private List<Voo> voo;


}
