package academy.samela.maratonajava.modificadorestatico.domain;

public class Car {
    private String name;
    private double maximumSpeed;
    private static double limitSpeed = 250;


    public Car(String name, double maximumSpeed) {
        this.name = name;
        this.maximumSpeed = maximumSpeed;
    }

    public void print(){
        System.out.println("-------------");
        System.out.println("Nome "+this.name);
        System.out.println("Velocidade Máxima "+ this.maximumSpeed);
        System.out.println("Velocidade Limite "+ Car.limitSpeed);
    }

    public static void setLimitSpeed(double limitSpeed){
        Car.limitSpeed = limitSpeed;
    }

    public static double getLimitSpeed(){
        return Car.limitSpeed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

}
