package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ADN {

    private static char [][] matrizADN;

    public static char[][] crearMatriz(int n) {
        matrizADN = new char[n][n];
        return matrizADN;
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

   /* public static void hallarSecuenciaCaracteres(char[][] matriz) {
        int contadorLetrasIguales = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz.length; col++) {
                char letraInicial = matriz [i][j];
                if(letraInicial == matriz[i][j]+1) {
                    contadorLetrasIguales += 1;


                }
            }
        }
    }

    */
    public static List<String> buscarCadenaADN(char adnBuscado){

        "Fila: 1", "Columna:1", "Columna:2","Columna:3",





  }


}

