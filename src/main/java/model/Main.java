package model;

public class Main {

    public static void main(String[] args) {

        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamanioMatriz = ADN.obtenerTamanioMatriz();

        char [][] matrizCreada = ADN.crearMatriz(tamanioMatriz);

        ADN.llenarMatrizAleatoria(matrizCreada);

        ADN.mostrarMatriz(matrizCreada);
    }
}