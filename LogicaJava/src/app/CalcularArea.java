package app;

import entities.CalcArea;

import java.util.Locale;
import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalcArea calcArea = new CalcArea();

        System.out.print("Digite a Largura: ");
        calcArea.width = Double.parseDouble(sc.nextLine());

        System.out.print("Digite o Comprimento: ");
        calcArea.length = Double.parseDouble(sc.nextLine());

        System.out.print("Preço por meto: ");
        calcArea.price = Double.parseDouble(sc.nextLine());

        System.out.println(calcArea);

        System.out.print("Deseja continuar? s/n: ".toUpperCase());
        calcArea.opt = sc.nextLine().toUpperCase().charAt(0);

        while (calcArea.opt != 'N'){

            System.out.print("Digite a Largura: ");
            calcArea.width = Double.parseDouble(sc.nextLine());

            System.out.print("Digite o Comprimento: ");
            calcArea.length = Double.parseDouble(sc.nextLine());

            System.out.print("Preço por meto: ");
            calcArea.price = Double.parseDouble(sc.nextLine());

            System.out.println(calcArea);

            System.out.print("Deseja continuar? s/n: ".toUpperCase());
            calcArea.opt = sc.nextLine().toUpperCase().charAt(0);
        }
        sc.close();
    }
}
