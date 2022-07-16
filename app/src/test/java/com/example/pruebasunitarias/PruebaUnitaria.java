package com.example.pruebasunitarias;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PruebaUnitaria {

    @Test
    public void isEmptyEditText_ReturnsTrue() {


        assertTrue(Validar.validateEmpty(""));
    }

    @Test
    public void isEmptyEditText_ReturnsFalse() {


        assertFalse(Validar.validateEmpty("prueba"));
    }

    @Test
    public void isEmailFormatCorrect_ReturnsFalse() {

        assertFalse(Validar.validateEmail("calpic95gmail.com"));
    }

    @Test
    public void isEmailFormatCorrect_ReturnTrue() {

        assertTrue(Validar.validateEmail("calpic95@gmail.com"));
    }

    @Test
    public void isUserinBD_ReturnTrue() {

        assertTrue(Validar.validateUser("calpic95@gmail.com","*calpic90"));
    }

    @Test
    public void isUserinBD_ReturnFalse() {

        assertFalse(Validar.validateUser("calpic90@gmail.com","*calpic90"));
    }

}