package Urok17Practiks;

class Student {
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class Task25 {
    public static void main(String[] args) {
        Student student = new Student();

        student.setFirstName("alex");
        student.setLastName("smith");
        student.setEmail("ALEX@SCHOOL.COM");

        String fullName = (student.getFirstName() + " "
                + student.getLastName()).toUpperCase();

        String email = student.getEmail().toLowerCase();

        System.out.println(fullName);
        System.out.println(email);
    }
}
