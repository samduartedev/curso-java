package academy.samela.maratonajava.introducao.introducaometodos.test;

import academy.samela.maratonajava.introducao.introducaometodos.domain.Student;


public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Taylor Swift";
        student01.age = 35;
        student01.gender = 'F';

        student02.name = "Sabrina";
        student02.age = 25;
        student02.gender = 'F';

        student01.print();
        student02.print();

    }
}
