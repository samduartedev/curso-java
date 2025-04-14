package academy.samela.maratonajava.modificadorfinal.test;

import academy.samela.maratonajava.modificadorfinal.domain.Buyer;
import academy.samela.maratonajava.modificadorfinal.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        Buyer Buyer = new Buyer();

        System.out.println(Car.VELOCIDADE_LIMITE);
        System.out.println(car.BUYER);
        car.BUYER.setName("Justin");
        System.out.println(car.BUYER);

    }
}
