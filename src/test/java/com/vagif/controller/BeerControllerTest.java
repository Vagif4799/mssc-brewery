package com.vagif.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vagif.model.BeerDto;
import com.vagif.service.BeerService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;


@RunWith(SpringRunner.class)
@WebMvcTest(BeerController.class)
class BeerControllerTest {

    @MockBean
    BeerService beerService;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    BeerDto validBeer;

    @Before
    public void setUp() {

        validBeer = BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Beer1")
                .beerStyle("Pare Ale")
                .upc(123456789L)
                .build();

    }

    public void getBeer() {
    }


}

















