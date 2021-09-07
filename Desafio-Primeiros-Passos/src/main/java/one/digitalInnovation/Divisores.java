package one.digitalInnovation;

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        System.out.println("Digite o número: ");
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Divisor: "+i);
            }
        }
        input.close();
    }
}
