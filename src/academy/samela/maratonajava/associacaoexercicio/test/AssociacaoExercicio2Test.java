package academy.samela.maratonajava.associacaoexercicio.test;

import academy.samela.maratonajava.associacaoexercicio.domain.Location;
import academy.samela.maratonajava.associacaoexercicio.domain.Seminary;
import academy.samela.maratonajava.associacaoexercicio.domain.Student;
import academy.samela.maratonajava.associacaoexercicio.domain.Teacher;

public class AssociacaoExercicio2Test {
    public static void main(String[] args) {

        Student student1 = new Student("João",14);
        Student student2 = new Student("Guilherme",13);
        Student[] students = {student1,student2};

        Teacher teacher = new Teacher("Bárbara","Ciências");


        Location location = new Location("Escola Adventista, Rua baruá, 138, Aleixo");

        Seminary seminary = new Seminary("Bing Bang",location);
        Seminary[] seminaries = {seminary};

        seminary.setStudents(students);
        teacher.setSeminars(seminaries);

        teacher.print();

    }
}
