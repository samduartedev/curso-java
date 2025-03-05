package academy.samela.maratonajava.introducao.introducaometodos.test;

import academy.samela.maratonajava.introducao.introducaometodos.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int [] numbers = {1,2,3,4,5};
        calculator.sumArray(numbers);

        calculator.sumVarArgs(1,1,2,5);
    }
}
