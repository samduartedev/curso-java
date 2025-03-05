package academy.samela.maratonajava.modificadorestatico.test;

import academy.samela.maratonajava.modificadorestatico.domain.Car;

public class CarroTest01 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 280);
        Car c2 = new Car("Mercedes",275);

        // mostra o limite de velocidade de 250
        c1.print();
        c2.print();

        Car.setLimitSpeed(180);

        // mostra o limite de velocidade de 180
        c1.print();
        c2.print();
    }
}
