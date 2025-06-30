package com.serkan.bankaapi.service;

import com.serkan.bankaapi.model.Hesap;
import com.serkan.bankaapi.repository.HesapRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HesapService {

    private final HesapRepository hesapRepository;

    public HesapService(HesapRepository hesapRepository) {
        this.hesapRepository = hesapRepository;
    }

    public Hesap ekle(Hesap hesap) {
        return hesapRepository.save(hesap);
    }

    public List<Hesap> listele() {
        return hesapRepository.findAll();
    }

    public Optional<Hesap> getir(String hesapNo) {
        return hesapRepository.findById(hesapNo);
    }

    public void sil(String hesapNo) {
        hesapRepository.deleteById(hesapNo);
    }
}
