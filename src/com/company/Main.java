package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Tamaño del array
        System.out.println("Introduzca el tamaño de los arrays (Número entero)");
        int tamano = sc.nextInt();

        int[] array1 = createaArrays(tamano,sc);

        for ()


    }

    public static int[] createaArrays(int tamano,Scanner sc) {
        int[] array = new int[tamano];
        for (int i=0; i<tamano;i++) {
            array[i]= sc.nextInt();
        } return array;
    }

}