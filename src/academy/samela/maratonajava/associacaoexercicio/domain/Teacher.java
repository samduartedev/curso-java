package academy.samela.maratonajava.associacaoexercicio.domain;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Teacher(String name){
        this.name = name;
    }

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Teacher(String name, String specialty, Seminar[] seminars) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public void print(){
        System.out.println("-----------");
        System.out.println("Professor: " + this.name);
        if(seminars == null) return;
        System.out.println("Seminários cadastrados: ");
        for (Seminar seminar : this.seminars) {
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getLocation().getAddress());
            if(seminar.getStudents() == null) continue;
            System.out.println("** Alunos **");
            for (Student student: seminar.getStudents()){
                System.out.println("Aluno "+ student.getName() + ", idade " + student.getAge());
            }
        }

    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public Seminar[] getSeminar(){
        return seminars;
    }
    public void setSeminars(Seminar[] seminars){
        this.seminars = seminars;
    }
}
