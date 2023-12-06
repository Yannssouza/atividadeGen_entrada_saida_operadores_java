package atividades;

import java.util.Scanner;

public class Atividade3 {

        public static void main(String[] args) {
            float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

            Scanner leia = new Scanner(System.in);

            System.out.println("Escreva seu Salário Bruto:");
            salarioBruto = Float.parseFloat(leia.nextLine());

            System.out.println("Escreva seu Adicional Noturno:");
            adicionalNoturno = Float.parseFloat(leia.nextLine());

            System.out.println("Escreva as Horas Extras:");
            horasExtras = Float.parseFloat(leia.nextLine());

            System.out.println("Escreva os Descontos:");
            descontos = Float.parseFloat(leia.nextLine());

            leia.close();

            salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

            System.out.println("Seu Salário Líquido é:\n" + salarioLiquido);
        }

    }
