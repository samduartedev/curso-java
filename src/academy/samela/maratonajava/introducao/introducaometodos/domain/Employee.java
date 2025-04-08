package academy.samela.maratonajava.introducao.introducaometodos.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double media;

    public void printData() {
        System.out.println("O nome do funcionário é " + this.name);
        System.out.println("A idade de " + this.name + " é " + this.age);
        if (salaries == null) {
            return;
        }
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("O" + (i + 1) + "º salário foi " + salaries[i]);
        }
        printMediaEmployee();

    }

    public void printMediaEmployee() {
        if (salaries == null) {
            return;
        }
        for (double salary : salaries) {
            media += salary;
        }
        media /= salaries.length;
        System.out.println("A media salarial de " + this.name + " é de " + media);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalaries() {
        return salaries;
    }

}

