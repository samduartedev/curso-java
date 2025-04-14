package academy.samela.maratonajava.heranca.test;

import academy.samela.maratonajava.heranca.domain.Address;
import academy.samela.maratonajava.heranca.domain.Employee;
import academy.samela.maratonajava.heranca.domain.Person;

public class HerancaTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Rua Barão");
        address.setCep("69057-512");

        Person person = new Person();
        person.setName("Taylor Swift");
        person.setCpf("58793426587");
        person.setAddress(address);
        person.print();

        Employee employee = new Employee();
        employee.setName("Olivia Rodrigo");
        employee.setCpf("54654161636");
        employee.setAddress(address);
        employee.setSalary(50000);
        System.out.println("--------------");
        employee.print();

    }
}
