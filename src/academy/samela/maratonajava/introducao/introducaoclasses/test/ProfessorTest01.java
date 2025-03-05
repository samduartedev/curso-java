package academy.samela.maratonajava.introducao.introducaoclasses.test;

import academy.samela.maratonajava.introducao.introducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Snape";
        professor.age = 50;
        professor.gender = 'M';
        System.out.println("Nome: " + professor.name + ", Idade: " + professor.age + ", Gênero: " + professor.gender);
    }
}
