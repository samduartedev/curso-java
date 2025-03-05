package academy.samela.maratonajava.introducao.introducaoclasses.test;

import academy.samela.maratonajava.introducao.introducaoclasses.domain.Student;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 35;
        student.name = "Taylor Swift";
        student.gender = 'F';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
