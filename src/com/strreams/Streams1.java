package com.strreams;

import java.util.*;

class Employee
{
    int id;
    String name;
    double salary;
    String department;
    int age;

    public Employee(int id, String name, double salary, String department, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }


}
public class Streams1 {

    static ArrayList<Employee> al = new ArrayList<>();
    static {
        al.add(new Employee(1, "Ram", 30000, "Java", 25));
        al.add(new Employee(2, "Ravi", 50000, "Testing", 27));
        al.add(new Employee(3, "Kiran", 70000, "Java", 28));
        al.add(new Employee(4, "Arun", 40000, "Python", 24));
        al.add(new Employee(5, "Raj", 60000, "Java", 30));
        al.add(new Employee(6, "Sam", 50000, "Testing", 26));
        al.add(new Employee(7, "John", 80000, "Python", 32));
        al.add(new Employee(8, "Anil", 35000, "Java", 23));
    }
    public static void main(String[] args) {
        Streams1.thirdHgst();
    }
    public static void secondSal()
    {

        List <Employee> employee= al.stream()
                .sorted((x, y) -> Double.compare(y.salary, x.salary))
                .distinct()
                .skip(1)
                .limit(1)
                .toList();
        System.out.println(employee);


    }
    public static void threeHigh()
    {
        List<Employee> list = al.stream()
                .sorted((x, y) -> Double.compare(y.salary, x.salary))
                .distinct()
                .limit(3)
                .toList();
        System.out.println(list);
    }
    public static void thirdHgst()
    {
        al.stream()
                .map(x->x.salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .limit(1)
                .forEach(System.out::println);
    }
    public static void avgSal()
    {
        al.stream()
                .mapToDouble(x->x.salary)
                .mapToObj(x->(Double) x);
    }

}
