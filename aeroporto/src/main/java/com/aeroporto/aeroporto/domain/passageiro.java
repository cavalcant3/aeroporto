package com.aeroporto.aeroporto.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class passageiro{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Column(name = "ID")
    private long id;
    private String name;
    private int numeroVoo;
    private String destino;

}
