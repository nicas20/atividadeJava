package atividadeJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double salario[] = new double[2];
        salario[0] = 1000;
        salario[1] = salario[0] + (0.015 * salario[0]);
        int ano = 1997;
        double taxa = 0.015;
        do {
            taxa = taxa * 2;
            salario[1] = salario[1] + (taxa * salario[1]);
            ano = ano + 1;
        } while (ano != 2023);
        System.out.println("O salário em " + (ano - 1) + " anos é: R$" + df.format(salario[1]));
        sc.close();
    }
}
