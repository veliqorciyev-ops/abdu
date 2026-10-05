package urok10Methods;

public class Student {
    String name;
    int age;
    int grade;
    public void showInfo(){
        System.out.println("Имя:"+name);
        System.out.println("Возраст:"+age);
        System.out.println("Оценка:"+grade);
    }

    public static void main(String[] args) {
        Student student= new Student();
        student.name="Alex";
        student.age=14;
        student.grade=85;
        student.showInfo();
    }
}
