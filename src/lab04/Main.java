package lab04;
import lab04.Person;
import lab04.Student;

public class Main {
    public static void main(String[] args) {
        Person obj = new Person("Chetan",19,'M');
        System.out.println(obj.toString());
        Student student=new Student(obj.getName(),obj.getAge(),obj.getGender(), 12345677L, 6.5);
        System.out.println(student);

    }
}
