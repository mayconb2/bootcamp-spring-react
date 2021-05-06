package com.bootcamp.sds.dssales.repositories;

import com.bootcamp.sds.dssales.dtos.SaleSuccessDTO;
import com.bootcamp.sds.dssales.dtos.SaleSumDTO;
import com.bootcamp.sds.dssales.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.bootcamp.sds.dssales.dtos.SaleSumDTO(obj.seller, SUM(obj.amount))" +
            " FROM Sale as obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.bootcamp.sds.dssales.dtos.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))" +
            " FROM Sale as obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}

