package Exceptions;

public class Task2 {
    public static void main(String[] args) {
String number="Hello";
try {
     int parsed=Integer.parseInt(number);
}catch (NumberFormatException e){
    System.out.println("Invalid Nuber");
}
    }}
