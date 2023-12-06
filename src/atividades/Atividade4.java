package atividades;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        float n1, n2, n3, n4, calculo;

        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva o primeiro numero:");
        n1 = Float.parseFloat(leia.nextLine());

        System.out.println("Escreva o segundo numero:");
        n2 = Float.parseFloat(leia.nextLine());

        System.out.println("Escreva a terceiro numero:");
        n3 = Float.parseFloat(leia.nextLine());

        System.out.println("Escreva o quarto numero:");
        n4 = Float.parseFloat(leia.nextLine());

        leia.close();

        calculo = (n1 * n2) - (n3 * n4);

        System.out.println("O resultado do calculo é:\n" + calculo);
    }

}
