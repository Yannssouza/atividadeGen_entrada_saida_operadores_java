package atividades;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        float salario, abono, novoSalario;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu salário:");
        salario = Float.parseFloat(leia.nextLine());

        System.out.println("Digite seu abono:");
        abono = Float.parseFloat(leia.nextLine());

        leia.close();

        novoSalario = salario + abono;

        System.out.println("Seu novo Salário é:\n" + novoSalario);
    }

}
