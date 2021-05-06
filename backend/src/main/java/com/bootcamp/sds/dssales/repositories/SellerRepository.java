package com.bootcamp.sds.dssales.repositories;

import com.bootcamp.sds.dssales.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
}

