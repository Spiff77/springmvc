package com.thomas.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomas.webapp.model.Lama;

public interface LamaDaoJpa extends JpaRepository<Lama, Long>{

}
