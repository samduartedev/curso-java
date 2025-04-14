package academy.samela.maratonajava.modificadorfinal.domain;

public final class Car {
    private String name;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Buyer BUYER = new Buyer();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
