package com.serkan.bankaapi.model;

import jakarta.persistence.*;

@Entity
public class Hesap {

    @Id
    private String hesapNo;

    private double bakiye;

    @ManyToOne
    @JoinColumn(name = "musteri_no") // foreign key
    private Musteri musteri;

    public Hesap() {}

    public Hesap(String hesapNo, double bakiye) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
    }

    public String getHesapNo() { return hesapNo; }
    public void setHesapNo(String hesapNo) { this.hesapNo = hesapNo; }

    public double getBakiye() { return bakiye; }
    public void setBakiye(double bakiye) { this.bakiye = bakiye; }

    public Musteri getMusteri() { return musteri; }
    public void setMusteri(Musteri musteri) { this.musteri = musteri; }
}
