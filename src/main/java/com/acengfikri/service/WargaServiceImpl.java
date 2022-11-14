package com.acengfikri.service;

import com.acengfikri.dto.WargaRequest;
import com.acengfikri.model.Warga;
import com.acengfikri.repository.WargaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WargaServiceImpl implements WargaService{

    @Autowired
    WargaRepository wargaRepository;

    public List<Warga> listAllWarga() {
        return wargaRepository.findAll();
//        return (Warga) wargaRepository.findAll();

    }

    @Override
    public Warga createData(Warga warga) {

        return wargaRepository.save(warga);

    }

    @Override
    public ResponseEntity<Warga> findOne(Long id) {
        return null;
    }

}
