package lista1;

import java.util.Scanner;

/*
* Questão 02: Escreva um programa que leia um número e determine se ele é par ou
ímpar.*/
public class Q2 {

    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);

        int num = teclado.nextInt();

        if (num % 2 == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("Número ímpar");
        }

    }
}
