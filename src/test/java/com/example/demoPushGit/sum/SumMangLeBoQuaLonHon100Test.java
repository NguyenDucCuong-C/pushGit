package com.example.demoPushGit.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumMangLeBoQuaLonHon100Test {

    @Test
    void sumMangLe() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rs = SumMangLeBoQuaLonHon100.SumMang(arr);
        assertEquals(25, rs);
    }

    @Test
    void sumMangLeMix() {
        int[] arr = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10};
        int rs = SumMangLeBoQuaLonHon100.SumMang(arr);
        assertEquals(-25, rs);
    }

    @Test
    void sumMang1PhanTule() {
        int[] arr = {99};
        int rs = SumMangLeBoQuaLonHon100.SumMang(arr);
        assertEquals(99, rs);
    }


    @Test
    void sumMangNull() {

        int[] arr = null;
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> SumMangLeBoQuaLonHon100.SumMang(arr));

        assertEquals("Không được null", exception.getMessage());
    }


    @Test
    void sumMangCoSoLonHon100() {
        int[] arr = {-155, 234, -364, 473, -53, 6, -7, 8, -9, 10};
        int rs = SumMangLeBoQuaLonHon100.SumMang(arr);
        assertEquals(-224, rs);
    }


}