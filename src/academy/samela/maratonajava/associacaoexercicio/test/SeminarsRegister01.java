package academy.samela.maratonajava.associacaoexercicio.test;

import academy.samela.maratonajava.associacaoexercicio.domain.Location;
import academy.samela.maratonajava.associacaoexercicio.domain.Seminar;
import academy.samela.maratonajava.associacaoexercicio.domain.Student;
import academy.samela.maratonajava.associacaoexercicio.domain.Teacher;
import java.util.Scanner;

public class SeminarsRegister01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Location location = new Location("Av Paulista");
        Student student = new Student("João",14);
        Student student1 = new Student("Vinicius",13);

        Teacher teacher = new Teacher("João Batista","Ciências");

        Student[] studentsSeminar = {student,student1};


        Seminar seminarScience = new Seminar("Big Bang",studentsSeminar, location);
        Seminar[] seminars = {seminarScience};

        teacher.setSeminars(seminars);

        teacher.print();

        }
    }
