package com.example.EcomarketSPAweb.Repository;

import com.example.EcomarketSPAweb.Model.GestionProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestionProductRepository extends JpaRepository<GestionProduct, Integer> {
}
