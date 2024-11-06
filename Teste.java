package org.example.q1;

import java.util.Scanner;

public class Teste {

    Scanner scanner = new Scanner(System.in);
    Retangulo retangulo = null;


    public void menu(){

        while(true){
            System.out.println("1. Criar um retângulo (Informar o valor de � � �)\n" +
                    "2. Calcular Área\n" +
                    "3. Calcular Perímetro\n" +
                    "0. Sair");

            System.out.print("Escolha uma das opções acima: ");
            int escolha = scanner.nextInt();

            switch(escolha){
                case 1 -> {
                    retangulo = new Retangulo();
                    System.out.print("Informe o valor da base: ");
                    double b = scanner.nextDouble();

                    System.out.print("Informe o valor da altura: ");
                    double h = scanner.nextDouble();

                    retangulo.setBase(b);
                    retangulo.setAltura(h);
                    break;
                }
                case 2 -> {
                    if (retangulo != null){
                        System.out.println("ÁREA= "+retangulo.calcArea(retangulo.getBase(), retangulo.getAltura()));
                    }else{
                        System.out.println("Nenhum retângulo foi criado! ");
                    }
                    break;
                }
                case 3 -> {
                    if (retangulo != null){
                        System.out.println("PERÍMETRO= "+retangulo.calcPerimetro(retangulo.getBase(), retangulo.getAltura()));
                    }else{
                        System.out.println("Nenhum retângulo foi criado! ");
                    }
                    break;
                }
                case 0 -> {
                    System.out.println("Saindo...");
                    System.exit(0);
                }
            }
        }


    }

}
