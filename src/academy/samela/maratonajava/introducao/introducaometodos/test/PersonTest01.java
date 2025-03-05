package academy.samela.maratonajava.introducao.introducaometodos.test;

import academy.samela.maratonajava.introducao.introducaometodos.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Taylor Swift");
        person.setAge(35);
//        pessoa.print();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
