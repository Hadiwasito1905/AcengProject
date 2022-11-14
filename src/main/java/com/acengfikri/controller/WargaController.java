package com.acengfikri.controller;

import com.acengfikri.dto.WargaRequest;
import com.acengfikri.dto.WargaResponse;
import com.acengfikri.model.Warga;
import com.acengfikri.service.WargaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("warga")
public class WargaController {

    @Autowired
    WargaService wargaService;


    @GetMapping("/findall")
    public ResponseEntity<?> findAll() {

//        List<Warga> wargas = wargaService.listAllWarga();


        try {
            List<Warga> warga = wargaService.listAllWarga();
            return ResponseEntity.ok().body(WargaResponse.builder()
                    .message("successfully")
                    .status(true)
                    .data(warga)
                    .build());

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(WargaResponse.builder()
                    .status(false)
                    .message("Authorization Invalid")
                    .data(null)
                    .build());

        }
    }

    @PostMapping("/savewarga")
    public ResponseEntity<?> saveData(@RequestBody Warga warga){
        return ResponseEntity.ok().body(wargaService.createData(warga));
    }
}
