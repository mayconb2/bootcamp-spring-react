package com.bootcamp.sds.dssales.repositories;

import com.bootcamp.sds.dssales.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}

