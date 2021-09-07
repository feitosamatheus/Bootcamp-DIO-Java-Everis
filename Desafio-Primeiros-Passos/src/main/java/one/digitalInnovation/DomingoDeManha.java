package one.digitalInnovation;

import java.util.Scanner;

public class DomingoDeManha {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o horário que o Bino acordou: ");
        while (leitor.hasNext()) {
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            int atraso = (60 * (hora - 7)) + min;

            switch (hora) {
                case (7):
                    System.out.println("Atraso maximo: " + atraso);
                    break;
                case (8):
                    System.out.println("Atraso maximo: " + atraso);
                    break;
                case (9):
                    System.out.println("Atraso maximo: " + atraso);
                    break;
                default:
                    System.out.println("Atraso maximo: 0");
            }
        }
        leitor.close();
    }
}
