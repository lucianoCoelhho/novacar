package com.example.demo.Repository;

import com.example.demo.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria , Long> {
}