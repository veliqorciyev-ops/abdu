package urok5LogicOperator;

public class NumberCompression {
    public static void main(String[] args) {
        int num1=25;
        int num2=30;
        System.out.println("Число1:"+num1+",Число2:"+num2);
        boolean isEqual=(num1 == num2);
        System.out.println("num1 равно num2:" + isEqual);
        boolean isNotEqual =(num1 != num2);
        System.out.println("num1 не равно num2:"+isNotEqual);
        boolean isGreater =(num1>num2);
        System.out.println("num1 больше num2:"+isGreater);
        boolean isLessOrEqual =(num1<=num2);
        System.out.println("num1 меньше или равно num2:"+isLessOrEqual);
    }
}
