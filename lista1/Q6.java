package lista1;

import java.util.Scanner;

/*
* Questão 06: Escreva um programa que receba a o peso e a altura de uma pessoa e
retorne o valor do IMC, o qual é calculado pela seguinte fórmula:*/
public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double peso = scan.nextDouble();
        double alt = scan.nextDouble();

        double imc = peso/(alt*alt);

        System.out.println("IMC: "+imc);
    }
}
