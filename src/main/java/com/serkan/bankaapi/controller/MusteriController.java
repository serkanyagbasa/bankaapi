package com.serkan.bankaapi.controller;

import com.serkan.bankaapi.model.Musteri;
import com.serkan.bankaapi.service.MusteriService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/musteriler")
public class MusteriController {

    private final MusteriService musteriService;

    public MusteriController(MusteriService musteriService) {
        this.musteriService = musteriService;
    }

    @PostMapping
    public Musteri musteriEkle(@RequestBody Musteri musteri) {
        return musteriService.ekle(musteri);
    }

    @GetMapping
    public List<Musteri> tumMusteriler() {
        return musteriService.listele();
    }

    @GetMapping("/{musteriNo}")
    public Musteri getir(@PathVariable String musteriNo) {
        return musteriService.getir(musteriNo).orElse(null);
    }

    @DeleteMapping("/{musteriNo}")
    public void sil(@PathVariable String musteriNo) {
        musteriService.sil(musteriNo);
    }
}
