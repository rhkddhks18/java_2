package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = a;
        a = b;
        b = c;
        System.out.println("a\n"+a+b);
        System.out.println(b);
    }
}
