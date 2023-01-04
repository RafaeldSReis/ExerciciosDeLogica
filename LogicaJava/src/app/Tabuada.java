package app;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para ver sua tabuada: ".toUpperCase());
        int n = Integer.parseInt(sc.nextLine());

        for (int i=0; i<=10; i++){
            int mult = n * i;
            System.out.println("Tabuada: " + n + " x " + i + " = " + mult);
        }

        System.out.print("Deseja continuar? s/n: ".toUpperCase());
        char opt = sc.nextLine().toUpperCase().charAt(0);

        while(opt != 'N'){
            System.out.print("Digite um numero para ver sua tabuada: ".toUpperCase());
            n = Integer.parseInt(sc.nextLine());

            for (int i=0; i<=10; i++){
                int mult = n * i;
                System.out.println("Tabuada: " + n + " x " + i + " = " + mult);
            }

            System.out.print("Deseja continuar? s/n: ".toUpperCase());
            opt = sc.nextLine().toUpperCase().charAt(0);
        }
        sc.close();
    }
}
