package com.aeroporto.aeroporto.repository;

import com.aeroporto.aeroporto.domain.Aviao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AviaoRepository extends JpaRepository<Aviao, Long> {
}
