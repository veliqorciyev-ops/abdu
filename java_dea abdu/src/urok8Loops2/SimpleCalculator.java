package urok8Loops2;

public class SimpleCalculator {
    public static void main(String[] args) {
        double number1 = 20;
        double number2 = 5;
        char operation = '*';

        switch (operation) {
            case '+':
                System.out.println("Результат: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Результат: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Результат: " + (number1 * number2));
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Ошибка: делить на ноль нельзя.");
                } else {
                    System.out.println("Результат: " + (number1 / number2));
                }
                break;
            default:
                System.out.println("Неизвестная операция.");
                break;
        }
    }
}
