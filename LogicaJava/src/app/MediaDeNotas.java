package app;

import entities.Average;

import java.util.Locale;
import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Media de 3 Notas");

        System.out.print("Digite o nome do Aluno: ");
        String student = sc.nextLine();

        System.out.print("Digite a 1° nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a 2° nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a 3° nota: ");
        double n3 = sc.nextDouble();

        Average average = new Average(n1, n2, n3, student);

        if(average.result() > 0 && average.result() < 5.0){
            System.out.print("A media do aluno " + average + " REPROVADO");
        } else if (average.result() <= 7.4) {
            System.out.print("A media do aluno " + average + " RECUPERAÇÃO");
        } else if (average.result() > 7.5) {
            System.out.print("A media do aluno " + average + " APROVADO");
        }

        sc.close();
    }
}
