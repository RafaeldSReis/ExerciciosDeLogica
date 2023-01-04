package app;

import entities.CalculateSalary;

import java.util.Locale;
import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular salario");
        System.out.print("Digite o nome do funcionario: ");
        String name = sc.nextLine();

        System.out.print("Digite o Salario do funcionario: ");
        double salary = Double.parseDouble(sc.nextLine());

        System.out.print("Imposto sobre o funcionario em %: ");
        int tax = Integer.parseInt(sc.nextLine());

        CalculateSalary calculateSalary = new CalculateSalary(name, salary, tax);

        System.out.printf("O funcionario: %s tem o salario de: R$ %.2f%n%n", calculateSalary.getName(), calculateSalary.totalSalary());

        System.out.print("Aumentar o salario do funcionario em %: ");
        int addValor = Integer.parseInt(sc.nextLine());
        calculateSalary.salaryIncrease(addValor);

        System.out.printf("O funcionario: %s Aumento de  o salario de: R$ %.2f%n%n", calculateSalary.getName(), calculateSalary.salaryIncrease(addValor));

        sc.close();
    }
}
