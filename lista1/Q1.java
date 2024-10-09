package lista1;

/*
* Questão 01: Escreva um programa que calcule a idade do usuário. Para isso, o programa
deve ler o ano de nascimento, o ano atual e depois mostrar na tela a idade. Obs.: O ano
deve ser informado no formato AAAA (ex.: 1980).
* */

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o seu ano de nascimento? ");
        int ano_nasc = teclado.nextInt();

        System.out.println("Digite o ano atual: ");
        int ano_atual = teclado.nextInt();

        System.out.println("A sua idade é "+(ano_atual - ano_nasc)+ " anos");





    }
}
