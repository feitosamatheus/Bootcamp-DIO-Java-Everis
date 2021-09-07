package one.digitalInnovation;

import java.util.Scanner;

public class RespostaTheon {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        int T, menor = 0, posMenor = 0;

        for (int i = 1; i <= N; i++) {
            T = leitor.nextInt();
            if ((T < menor) && (N >= 1) && (N <= 100) && (T >= 0) && (T <= 20)) {
                menor = T;
                posMenor = i;
            } else if ((posMenor == 0) && (N >= 1) && (N <= 100) && (T >= 0) && (T <= 20)) {
                menor = T;
                posMenor = i;
            }
        }
        System.out.println(posMenor);
        leitor.close();
    }
}
