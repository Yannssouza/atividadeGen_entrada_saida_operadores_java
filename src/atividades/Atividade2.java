package atividades;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, mediaFinal;

        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva a primeira nota:");
        nota1 = Float.parseFloat(leia.nextLine());

        System.out.println("Escreva a segunda nota:");
        nota2 = Float.parseFloat(leia.nextLine());

        System.out.println("Escreva a terceira nota:");
        nota3 = Float.parseFloat(leia.nextLine());

        System.out.println("Escreva a quarta nota:");
        nota4 = Float.parseFloat(leia.nextLine());

        leia.close();

        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média final é:\n" + mediaFinal);
    }

}
