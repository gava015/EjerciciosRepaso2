package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ADN {

    public static char[][] crearMatriz(int n) {
        char[][] matriz = new char[n][n];
        return matriz;
    }

    public static int obtenerTamanioMatriz() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void llenarMatrizAleatoria(char[][] matriz) {
        Random random = new Random();
        char[] letras = {'A', 'T', 'C', 'G'};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int indiceLetra = random.nextInt(letras.length);
                matriz[i][j] = letras[indiceLetra];
            }
        }
    }

    public static void mostrarMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void hallarSecuenciaCaracteres(char[][] matriz) {
        int contadorLetrasIguales = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //Logica
            }
        }
    }
}

