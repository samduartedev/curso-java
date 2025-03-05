package academy.samela.maratonajava.introducao.introducaometodos.test;

import academy.samela.maratonajava.introducao.introducaometodos.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 1;
        int b = 2;
        calculator.changesTwoNumbers(a,b);
        System.out.println("------------------------");
        System.out.println("Num1: " + a);
        System.out.println("Num2: " + b);


    }
}
