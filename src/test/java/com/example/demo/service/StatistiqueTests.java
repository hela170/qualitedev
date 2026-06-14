package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class StatistiqueTests {

    @MockBean
    StatistiqueImpl statistiqueImpl;

    @Test
    void calculPrixMoyen() {

        Echantillon echantillon = new Echantillon(2, 15000);

        when(statistiqueImpl.prixMoyen()).thenReturn(echantillon);

        Echantillon resultat = statistiqueImpl.prixMoyen();

        assertEquals(2, resultat.getNombreDeVoitures());
        assertEquals(15000, resultat.getPrixMoyen());
    }

    @Test
    void calculPrixMoyenUneVoiture() {

        Echantillon echantillon = new Echantillon(1, 5000);

        when(statistiqueImpl.prixMoyen()).thenReturn(echantillon);

        Echantillon resultat = statistiqueImpl.prixMoyen();

        assertEquals(1, resultat.getNombreDeVoitures());
        assertEquals(5000, resultat.getPrixMoyen());
    }
}