package academy.samela.maratonajava.introducao.introducaometodos.test;

import academy.samela.maratonajava.introducao.introducaometodos.domain.Employee;

import java.util.Scanner;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        double[] salarios = new double[3];
        employee.setSalaries(salarios);
        System.out.println("Insira o nome do funcionário: ");
        employee.setName(scanner.next());
        System.out.println("Insira a idade do funcionário: ");
        employee.setAge(scanner.nextInt());
        System.out.println("Insira o primeiro salário do funcionário: ");
        employee.getSalaries()[0] = scanner.nextDouble();
        System.out.println("Insira o segundo salário do funcionário: ");
        employee.getSalaries()[1] = scanner.nextDouble();
        System.out.println("Insira o terceiro salário do funcionário: ");
        employee.getSalaries()[2] = scanner.nextDouble();
        employee.printData();
    }
}
