package lista1;
/*
* Questão 04: Escreva um programa que leia 02 números e determine qual o maior
número digitado.*/

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("O número 1 é maior que o múmero 2");
        }else{
            System.out.println("O número 2 é maior que o múmero 1");
        }
    }
}
