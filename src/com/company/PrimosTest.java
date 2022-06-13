package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {

    @Test
    void generarPrimos1() {
        int []array= new int[]{};
        int [] primos=Primos.generarPrimos(1);
        assertArrayEquals(array,primos);
    }

    @Test
    void generarPrimos2() {
        int [] array =new int[]{2};
        int [] primos=Primos.generarPrimos(2);
        assertArrayEquals(array,primos);
    }

    @Test
    void generarPrimos5() {
        int [] array =new int[]{2,3,5};
        int[] primos = Primos.generarPrimos(5);
        assertArrayEquals(array,primos);
    }

    @Test
    void generarPrimos10() {
        int [] array =new int[]{2,3,5,7};
        int [] primos=Primos.generarPrimos(10);
        assertArrayEquals(array,primos);
    }

    @Test
    void generarPrimos100() {
        int [] array =new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int [] primos=Primos.generarPrimos(100);
        assertArrayEquals(array,primos);

    }

}