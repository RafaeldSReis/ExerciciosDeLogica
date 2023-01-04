package app;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class CalcBaseAlturaRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular a base e a altura de um Retangulo");
        System.out.print("Digite a altura: ");
        double height = Double.parseDouble(sc.nextLine());

        System.out.print("Digite a base: ");
        double base = Double.parseDouble(sc.nextLine());

        Rectangle rectangle = new Rectangle(height, base);

        System.out.print("RETANGULO: " + rectangle);

        sc.close();
    }
}
