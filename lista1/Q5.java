package lista1;

import java.util.Scanner;

/*
* Questão 05: Escreva um programa que leia a base e a altura de um retângulo e retorne a
sua área (� � h) e o seu perímetro (2� + 2h).*/
public class Q5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double b = scan.nextDouble();
        double h = scan.nextDouble();

        double area = b*h;
        double perim = 2*(b+h);

        System.out.println("ÁREA: "+area);
        System.out.println("PERÍMETRO: "+perim);
    }

}
