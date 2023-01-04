package app;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class RegistroDeFuncionario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionarios deseja registrar? ");
        int qnt = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<qnt; i++){
            System.out.println("Funcionario #" + (i+1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salario: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            list.add(employee);

        }

        System.out.print("Deseja aumentar o salario de qual funcionario: ");
        int idSalary = sc.nextInt();
        Employee employee = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        if(employee == null){
            System.out.println("Esse ID não existe!");
        }
        else {
            System.out.print("Digite a porcentagem do aumento salarial: ");
            double percent = sc.nextDouble();
            employee.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("Lista de funcionarios:");
        // Para cada funcionario na lista
        for(Employee emp : list){
            System.out.println(emp);
        }
        sc.close();
    }
}
