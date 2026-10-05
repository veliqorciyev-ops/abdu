package urok10Methods;

public class Calculator {
    public int sum(int a,int b){
        return  a+b;
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int result=calculator.sum(10,5);
        System.out.println("Sum:"+result);
    }
}
