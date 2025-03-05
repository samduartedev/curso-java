package academy.samela.maratonajava.introducao.introducaometodos.test;

import academy.samela.maratonajava.introducao.introducaometodos.domain.Calculator;

public interface CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multiplyTwoNumbers(2,2);
        System.out.println(calculator.divideTwoNumbers(20,10));
    }
}
