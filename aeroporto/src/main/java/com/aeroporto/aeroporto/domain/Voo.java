package com.aeroporto.aeroporto.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Voo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    aqui ou ali vou ter a lista?
    @OneToMany
    private Aviao aviao;
    @OneToMany
    private Aeroporto aeroportoPartida;
    @OneToMany
    private Aeroporto aeroportoChegada;
    private LocalDate horaChegada;
    private LocalDate dataChegada;
    private int lotacao;
    private double pesoCarga;
    private double precoViagem;
}
