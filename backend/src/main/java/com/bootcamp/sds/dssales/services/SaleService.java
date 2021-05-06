package com.bootcamp.sds.dssales.services;

import com.bootcamp.sds.dssales.dtos.SaleDTO;
import com.bootcamp.sds.dssales.entities.Sale;
import com.bootcamp.sds.dssales.repositories.SaleRepository;
import com.bootcamp.sds.dssales.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable page) {
        sellerRepository.findAll();
        Page<Sale> entities = repository.findAll(page);
        return entities.map(SaleDTO::new);
    }
}
