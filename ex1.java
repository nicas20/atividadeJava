package atividadeJava;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numeros[" + i + "] = " + numeros[i]);
        }
        sc.close();
    }
}
