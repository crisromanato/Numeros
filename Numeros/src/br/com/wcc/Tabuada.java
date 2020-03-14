package br.com.wcc;

public class Tabuada {
    public static void main(String[] args) {
        int valor;
        int valor1 = 2;
        System.out.println("Tabuada do 2");
        for (valor = 1; valor < 10; ++valor){
            System.out.println(valor + " x " + valor1 + " = " + valor*valor1);
        }
    }

}
