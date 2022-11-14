package com.acengfikri.service;

import com.acengfikri.dto.WargaRequest;
import com.acengfikri.model.Warga;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface WargaService {

    Warga createData(Warga warga);

    List<Warga> listAllWarga();

    ResponseEntity<Warga> findOne(Long id);
}
