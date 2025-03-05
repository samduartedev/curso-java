package academy.samela.maratonajava.introducao.introducaoclasses.test;

import academy.samela.maratonajava.introducao.introducaoclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Uno";
        car1.model = "EX";
        car1.year = 2018;

        car2.name = "Ford Ka";
        car2.model = "Sedan";
        car2.year = 2022;

        System.out.println("CAR 1");
        System.out.println("Name: " + car1.name + ", model: " + car1.model + ", year: " + car1.year);
        System.out.println("-------------------------------------------");
        System.out.println("CAR 2");
        System.out.println("Name: " + car2.name + ", model: " + car2.model + ", year: " + car2.year);

    }
}
