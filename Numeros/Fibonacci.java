package br.com.wcc;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c;
        for (int i = 0; i < 10; i++) {
            System.out.println(a); // começa a seq. com 1 e o segundo elemento da sequencia 1 , o próximo número de
            // fibonacci será 2, depois 3, depois 5, depois 8 ou seja, "soma dos dois ultimos números" .....
            c = a;
            a = a + b;
            b = c;

        }
    }
}