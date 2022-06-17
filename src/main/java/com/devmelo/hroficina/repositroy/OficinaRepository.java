package com.devmelo.hroficina.repositroy;

import com.devmelo.hroficina.domain.Oficina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OficinaRepository extends JpaRepository<Oficina, Long> {

    Optional<Oficina> findByCnpj(Long cnpj);
}
