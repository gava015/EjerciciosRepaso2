package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ADN {


    public static char[][] crearMatriz(int n) {
        char[][] matrizADN = new char[n][n];
        return matrizADN;
    }

    public static int obtenerTamanioMatriz() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static char obtenerCaracter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
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

    public static List<String> buscarCadenaADN(char adnBuscado, char[][] matrizADN) {
        List<String> posicionesCaracteresIguales = null;
        for (int i = 0; i < matrizADN.length; i++) {
            for (int j = 0; j < matrizADN[i].length; j++) {

                if (matrizADN[i][j] == adnBuscado) {
                    posicionesCaracteresIguales = new ArrayList<>();
                    posicionesCaracteresIguales.add("Fila:" + i);
                    for (int k = j ; k < 3; k++) {
                        if (k > matrizADN.length - 1) {
                            if (matrizADN[i][k] == adnBuscado) {
                                posicionesCaracteresIguales.add("Col:" + k);
                            }
                        }
                    }

                    if(posicionesCaracteresIguales.size()-1 == 4){
                        break;
                    }
                }
            }
        }
        return posicionesCaracteresIguales;
    }
}

