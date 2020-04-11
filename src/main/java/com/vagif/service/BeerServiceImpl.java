package com.vagif.service;

import com.vagif.model.BeerDto;
import com.vagif.service.BeerService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Efes")
                .beerStyle("Pale Ale")
                .build();
    }
}
