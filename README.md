# 💳 Banka Otomasyonu Projesi

Bu proje, Spring Boot kullanarak geliştirilmiş basit bir banka yönetim sistemidir. Proje kapsamında müşteri ve hesap işlemleri için RESTful API uç noktaları oluşturulmuştur.

---

## 🚀 Proje Özellikleri

- Java & Spring Boot kullanılarak geliştirildi
- REST API yapısında müşteri ve hesap işlemleri
- H2 veritabanı entegrasyonu (bellek içi)
- Spring Data JPA ile veri işlemleri
- Örnek veri eklemek için `data.sql` kullanıldı
- Railway ile canlı deploy edildi

---

## 🔗 Canlı Uygulama

👉 [https://bankaapi-production.up.railway.app](https://bankaapi-production.up.railway.app)

---

## 🛠 Kullanılan Teknolojiler

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Maven
- H2 Database
- Railway (Deploy)

---

## 📁 Proje Yapısı

```
src
└── main
    └── java
        └── com.serkan.bankaapi
            ├── controller
            ├── model
            ├── repository
            └── BankaapiApplication.java
    └── resources
        ├── application.properties
        └── data.sql
```

---

## 🧪 API Endpointleri

| Metod | URL | Açıklama |
|-------|-----|----------|
| GET | `/musteriler` | Tüm müşterileri listeler |
| POST | `/musteriler` | Yeni müşteri ekler |
| GET | `/hesaplar` | Tüm hesapları listeler |
| POST | `/hesaplar` | Yeni hesap ekler |

---

## 📌 Örnek Veri

`src/main/resources/data.sql` dosyasında başlangıç için örnek müşteri ve hesap verileri yer alır.

---

## 🧑‍🎓 Hazırlayan

Serkan Yağbasa  
İstanbul Medipol Üniversitesi – Bilgisayar Programcılığı
