package com.bootcamp.sds.dssales.services;

import com.bootcamp.sds.dssales.dtos.SellerDTO;
import com.bootcamp.sds.dssales.entities.Seller;
import com.bootcamp.sds.dssales.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> entities = repository.findAll();
        return entities.stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
