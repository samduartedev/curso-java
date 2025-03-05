package academy.samela.maratonajava.introducao.introducaometodos.domain;

public class StudentPrinter {
    public void print(Student student){
        System.out.println("--------------------");

        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.age);

    }
}
