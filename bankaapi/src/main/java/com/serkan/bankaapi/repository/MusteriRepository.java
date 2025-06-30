package com.serkan.bankaapi.repository;

import com.serkan.bankaapi.model.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusteriRepository extends JpaRepository<Musteri, String> {
}
