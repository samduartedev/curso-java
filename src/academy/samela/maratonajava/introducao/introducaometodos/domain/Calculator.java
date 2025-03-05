package academy.samela.maratonajava.introducao.introducaometodos.domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int x, int y) {
        System.out.println(x * y);
    }

    public double divideTwoNumbers(double x, double y) {
        if (x == 0 || y == 0) {
            return 0;
        }
        return x / y;
    }

    public void printDivisionTwoNumbers(double num1, double num2){
        if (num2 ==0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }

    public void changesTwoNumbers(int number1, int number2) {
        number1 = 99;
        number2 = 33;
        System.out.println("Dentro do changesTwoNumbers");
        System.out.println("Num1 " + number1);
        System.out.println("Num2 " + number2);

    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers) {
        int soma = 0;
        for (int i : numbers) {
            soma += i;
        }
        System.out.println(soma);
    }

}
