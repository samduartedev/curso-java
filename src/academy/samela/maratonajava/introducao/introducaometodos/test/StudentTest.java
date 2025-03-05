package academy.samela.maratonajava.introducao.introducaometodos.test;

import academy.samela.maratonajava.introducao.introducaometodos.domain.Student;
import academy.samela.maratonajava.introducao.introducaometodos.domain.StudentPrinter;

public class StudentTest {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();

        student01.name = "Taylor Swift";
        student01.age = 35;
        student01.gender = 'F';

        student02.name = "Sabrina";
        student02.age = 25;
        student02.gender = 'F';

        printer.print(student01);
        printer.print(student02);
    }
}
