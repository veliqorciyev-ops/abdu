package urok13Interhance;

public class Animal {
     String name;
   int age;
   public void showInfo(){
       System.out.println(name+":"+age);
   }
}


 class Dog extends Animal{
    public void bark(){
        System.out.println("Гав");
    }
}
class Cat extends Animal{
    public void meow(){
        System.out.println("Meow!");
    }
}

 class Main {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.name ="Rex";
        dog.age=3;
        dog.showInfo();
        dog.bark();
        Cat cat=new Cat();
        cat.name="messi";
        cat.age=2;
        cat.showInfo();
        cat.meow();
    }
}


