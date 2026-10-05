package urok10Methods;

public class Dog {
    String name;
    int age;
    public void bark(){
        System.out.println(name +" is barking!");
    }

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name ="Rex";
        dog1.age=3;
        Dog dog2=new Dog();
        dog2.name="Max";
        dog2.age=5;
        dog1.bark();
        dog2.bark();
    }
}