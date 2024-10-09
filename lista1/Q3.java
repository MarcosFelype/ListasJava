package lista1;
/*
* Questão 03: Escreva um programa que leia a altura de 03 pessoas e calcule a média.*/

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double alt1 = scan.nextDouble();
        double alt2 = scan.nextDouble();
        double alt3 = scan.nextDouble();

        double media = (alt1+alt2+alt3)/3;

        System.out.println("A média é: "+media);
    }
}
