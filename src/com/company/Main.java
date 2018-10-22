package com.company;

public class Main {


    public static int sumaArray (int [] array) {
        int suma = 0;
        for (int n: array) {
            suma +=n;
        }
        return suma;
    }

    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6};

        int sumaA = sumaArray(a);
        System.out.println("La suma del array a es: "+sumaA);

    }
}
