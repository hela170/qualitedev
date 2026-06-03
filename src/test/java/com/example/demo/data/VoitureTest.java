package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        Voiture voiture = new Voiture ("Ferrari", 5000); [cite: 43]
        
        Assert.isTrue(voiture.getMarque().equals("Ferrari"), "Doit être Ferrari"); [cite: 44]
        Assert.isTrue(voiture.getPrix() == 5000, "Doit être 5000"); [cite: 45]
        
        // La clef primaire n'a pas été générée [cite: 46]
        Assert.isTrue(voiture.getId() == 0, "Doit être 0"); [cite: 47]
    }

}