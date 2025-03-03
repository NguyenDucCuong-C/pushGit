package com.example.demoPushGit.sum;

public class SumMangLeBoQuaLonHon100 {
    public static int SumMang(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Không được null");
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] < 100) {
                sum += arr[i];
            }
        }

        return sum;
    }
}
