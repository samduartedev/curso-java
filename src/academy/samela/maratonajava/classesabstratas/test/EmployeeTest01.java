package academy.samela.maratonajava.classesabstratas.test;

import academy.samela.maratonajava.classesabstratas.domain.Developer;
import academy.samela.maratonajava.classesabstratas.domain.Employee;
import academy.samela.maratonajava.classesabstratas.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Phineas",6000);
        System.out.println(manager);
        Developer developer = new Developer("Gustavo",5000);
        System.out.println(developer);
    }
}
