package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zmáčkni 1 pro sečtení");
        System.out.println("Zmáčkni 2 pro odčítání");
        int vyber = sc.nextInt();
        int [][] matice1 = {{1, 2, 3},
                            {4, 6, 6},
                            {7, 8, 9}};

        int [][] matice2 = {{1, 2, 3},
                            {4, 6, 6},
                            {7, 8, 9}};

        int [][] scitani = {{0, 0, 0},
                            {0, 0, 0},
                            {0, 0, 0}};
        if(vyber == 1){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    scitani[i][j] = matice1[i][j] + matice2[i][j];
                }
            }
            System.out.println("Součet:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(scitani[i][j] + " ");
                }
            }
        }
        if(vyber == 2){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    scitani[i][j] = matice1[i][j] - matice2[i][j];
                }
            }
            System.out.println("Odčítání:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(scitani[i][j] + " ");
                }
            }
        }
    }
}
