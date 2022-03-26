package com.aeroporto.aeroporto.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Aviao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String identificacao;
    private double capacCarga;
    private String modelo;
    private int qtdTurbinas;
    private int capacPassageiros;
    //??????????????
    @OneToMany(mappedBy = "Voo", cascade = CascadeType.ALL)
    @JoinColumn(name = "aviao_modelo")
    private List<Aviao> aviaoList;

}