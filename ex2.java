
public class ex2 {

    public static void main(String[] args) {
        double sal = 1000;
        int ano = 1996;
        int atual = 2022;
        int dif = atual - ano;
        double perc = 1.5;
        for (int i = 1; i <= dif; i++) {
            sal = sal + (sal * perc) / 100;
            perc *= 2;
        }
        System.out.println("O salario atual é: R$" + sal);
    }
}
