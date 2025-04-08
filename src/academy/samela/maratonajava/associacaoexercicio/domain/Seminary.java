package academy.samela.maratonajava.associacaoexercicio.domain;

public class Seminary {
    private String title;
    Location location;
    Student[] students;

    public Seminary(String title, Location location) {
        this.title = title;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
