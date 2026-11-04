import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class LambdaExprsn {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(new Student("satya",21));
        al.add(new Student("jaggu",54));
        al.add(new Student("vhim",32));
        al.add(new Student("chutki",16));

        Comparator<Student> c= (s1,s2)-> Integer.compare(s1.age, s2.age);
        Collections.sort(al,c);
        System.out.println(al);
    }
}
