package com.serkan.bankaapi.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Musteri {

    @Id
    private String musteriNo;

    private String adSoyad;

    @OneToMany(mappedBy = "musteri", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Hesap> hesaplar;

    public Musteri() {}

    public Musteri(String musteriNo, String adSoyad) {
        this.musteriNo = musteriNo;
        this.adSoyad = adSoyad;
    }

    public String getMusteriNo() { return musteriNo; }
    public void setMusteriNo(String musteriNo) { this.musteriNo = musteriNo; }

    public String getAdSoyad() { return adSoyad; }
    public void setAdSoyad(String adSoyad) { this.adSoyad = adSoyad; }

    public List<Hesap> getHesaplar() { return hesaplar; }
    public void setHesaplar(List<Hesap> hesaplar) { this.hesaplar = hesaplar; }
}
