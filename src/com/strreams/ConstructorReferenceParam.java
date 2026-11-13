package com.strreams;
class Con
{
    Con(int i,int j)
    {
        System.out.println(getClass().getName());
    }
    void hello()
    {
        System.out.println("hello");
    }

}
interface InterF{
    Con get(int i,int j);
}
public class ConstructorReferenceParam {
    public static void main(String[] args) {
        InterF i=Con::new;
        i.get(10,20).hello();
    }
}
