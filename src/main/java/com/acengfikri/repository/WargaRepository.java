package com.acengfikri.repository;

import com.acengfikri.model.Warga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WargaRepository extends JpaRepository<Warga, Long> {

    Warga findByNamaWarga(String name);
}
