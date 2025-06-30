package com.serkan.bankaapi.repository;

import com.serkan.bankaapi.model.Hesap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HesapRepository extends JpaRepository<Hesap, String> {
}
