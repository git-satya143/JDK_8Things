package com.strreams;
class Sample
{
    Sample()
    {
        System.out.println(getClass().getName());
    }
    void hello()
    {
        System.out.println("hello");
    }

}
interface Inter{
    Sample get();
}
public class ConstructorReference {
    public static void main(String[] args) {
        Inter i=Sample::new;
        i.get().hello();
    }
}
