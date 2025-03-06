package academy.samela.maratonajava.associacao.test;

import academy.samela.maratonajava.associacao.domain.School;
import academy.samela.maratonajava.associacao.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        //associação muitos para um
        Teacher teacher = new Teacher("Kakashi");
        Teacher teacher2 = new Teacher("Jiraya");
        Teacher[] teachers = {teacher,teacher2};
        School school = new School("Aldeia da folha",teachers);
        school.print();
    }
}
