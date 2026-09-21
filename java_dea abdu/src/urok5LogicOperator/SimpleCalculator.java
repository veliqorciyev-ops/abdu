package urok5LogicOperator;

public class SimpleCalculator {
    public static void main(String[] args) {
        int a=15;
        int b=4;
        int sum= a+b;
        System.out.println("Сумма:"  +sum);
        int substraction=a-b;
        System.out.println("Разность:" +substraction);
        int multp=a*b;
        System.out.println("Произведение:"+multp);
        int delenie=  a/b;
        System.out.println("Частное(целое):"+delenie);
        int ostatok=a%b;
        System.out.println("Остаток от деления:"+ostatok);
    }
}
