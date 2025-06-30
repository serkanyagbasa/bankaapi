package com.serkan.bankaapi.controller;

import com.serkan.bankaapi.model.Hesap;
import com.serkan.bankaapi.service.HesapService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hesaplar")
public class HesapController {

    private final HesapService hesapService;

    public HesapController(HesapService hesapService) {
        this.hesapService = hesapService;
    }

    @PostMapping
    public Hesap hesapEkle(@RequestBody Hesap hesap) {
        return hesapService.ekle(hesap);
    }

    @GetMapping
    public List<Hesap> tumHesaplar() {
        return hesapService.listele();
    }

    @GetMapping("/{hesapNo}")
    public Hesap getir(@PathVariable String hesapNo) {
        return hesapService.getir(hesapNo).orElse(null);
    }

    @DeleteMapping("/{hesapNo}")
    public void sil(@PathVariable String hesapNo) {
        hesapService.sil(hesapNo);
    }
}
