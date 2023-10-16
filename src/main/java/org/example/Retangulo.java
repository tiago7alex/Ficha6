package org.example;
public class Retangulo {
    public int area(int base, int altura) {
        return altura*base;
    }
    public int perimetro(int base, int altura) {
        return 2*(base+altura);
    }
    public boolean isTriangle(int a, int b, int c) {
        return (a+b > c) && (b+c > a) && (a+c > b);
    }
}