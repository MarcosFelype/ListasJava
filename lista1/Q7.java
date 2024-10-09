package lista1;

import java.util.Scanner;

/*
* Questão 07: Escreva um programa que leia dois números e realize a operação aritmética
desejada pelo usuário com base nas seguintes opções:
1. Retornar a soma entre dois números;
2. Retornar a subtração entre dois números;
3. Retornar a multiplicação entre dois números;
4. Retornar a divisão entre dois números;*/
public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("---MENU DE OPÇÕES---\n1- Retornar a soma de dois números\n2- Retornar a subtração de dois números\n3- Retornar a multiplicação dos dois números\n4- Retornar a divisão dos dois números");
        System.out.println("Sua escolha: ");
        int esc = scan.nextInt();
        switch(esc){
            case 1:
                System.out.println(a+b);
            case 2:
                System.out.println(a-b);
            case 3:
                System.out.println(a*b);
            case 4:
                double div = (double) a/b;
                System.out.println(div);
        }
    }
}
