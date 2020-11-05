package com.example.demo;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarControllerTest extends TestCase {
    private final String carType = "SEDAN";


    @Test
    void getOtomobilSahipler() throws Exception{
        assertEquals(carType,"SEDAN");

    }
}