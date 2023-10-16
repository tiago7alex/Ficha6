package org.example;
public class Digitos {
    public static double calcularMediaDigitos(int numero) {
        int absNumero = Math.abs(numero);
        int somaDigitos = 0;
        int contadorDigitos = 0;

        while (absNumero > 0) {
            int digito = absNumero % 10;
            somaDigitos += digito;
            contadorDigitos++;
            absNumero /= 10;
        }
        return (double) somaDigitos / contadorDigitos;
    }
}