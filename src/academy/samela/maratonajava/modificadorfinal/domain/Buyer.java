package academy.samela.maratonajava.modificadorfinal.domain;

public class Buyer {
    private String name;

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
