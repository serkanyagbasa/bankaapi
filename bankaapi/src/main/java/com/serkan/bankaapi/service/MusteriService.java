package com.serkan.bankaapi.service;

import com.serkan.bankaapi.model.Musteri;
import com.serkan.bankaapi.repository.MusteriRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusteriService {

    private final MusteriRepository musteriRepository;

    public MusteriService(MusteriRepository musteriRepository) {
        this.musteriRepository = musteriRepository;
    }

    public Musteri ekle(Musteri musteri) {
        return musteriRepository.save(musteri);
    }

    public List<Musteri> listele() {
        return musteriRepository.findAll();
    }

    public Optional<Musteri> getir(String musteriNo) {
        return musteriRepository.findById(musteriNo);
    }

    public void sil(String musteriNo) {
        musteriRepository.deleteById(musteriNo);
    }
}
