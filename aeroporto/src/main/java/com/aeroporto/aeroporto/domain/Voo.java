package com.aeroporto.aeroporto.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Voo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    aqui ou ali vou ter a lista?

//    private Aeroporto aeroportoChegada;
    private LocalDate horaChegada;
    private LocalDate dataChegada;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aviao_modelo")
    private Aviao aviao;
    private int lotacao;
    private double pesoCarga;
    private double precoViagem;

 //   @OneToMany(mappedBy = "voo",cascade = CascadeType.ALL)
 //   @JoinColumn(name ="modelo")
//    private List<Aviao> aviaos;
//
//    public Aviao getAviao() {
//        return aviao;
//    }

}
