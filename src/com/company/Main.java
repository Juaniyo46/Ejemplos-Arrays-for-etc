package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Tamaño del array
        System.out.println("Introduzca el tamaño de los arrays (Número entero)");
        int tamano = sc.nextInt();

        //Creamos los dos arrays pedidos vacios
        int[] arrayPrimero=createArray(tamano,sc);
        int[] arraySegundo=createArray(tamano,sc);


        //Creamos bucle de multiplicación
        int[] arrayResultado=new int[tamano];
        for (int i =0; i<tamano;i++) {
            arrayResultado[i]=arrayPrimero[i]*arraySegundo[i];
        }

        System.out.println("El array primero " + Arrays.toString(arrayPrimero)+" por el array segundo "+Arrays.toString(arraySegundo)+"es igual a: "+Arrays.toString(arrayResultado));

    }
    public static int[] createArray (int tamano, Scanner sc) {
        //Creamos un array nuevo vacio
        System.out.printf("Introduzca %d valores separados por espacios",tamano);
        int [] array = new int[tamano];
            for (int i=0; i<tamano;i++) {
                array[i]=sc.nextInt();
        } return array;
    }

}