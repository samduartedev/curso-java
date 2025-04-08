package academy.samela.maratonajava.associacaoexercicio.domain;

public class Teacher {
    private String name;
    private String specialty;
    Seminary[] seminars;

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public void print(){
        System.out.print("Professor: ");
        System.out.println(this.name);
        System.out.print("Especialidade: ");
        System.out.println(this.specialty);
        if (seminars ==null) return;
        {
            System.out.println("Seminários cadastrados: ");
            for (Seminary seminary: seminars){
                System.out.println(seminary.getTitle());
                System.out.println("Localização:");
                System.out.println(seminary.getLocation().getAddress());
                if(seminary.getStudents() ==null) continue;
                {
                    System.out.println("Alunos: ");
                    for (Student student: seminary.students){
                        System.out.println("Nome: " + student.getName() + "," + " idade: "+ student.getAge());
                    }
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminary[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminary[] seminars) {
        this.seminars = seminars;
    }
}
