package com.strreams;

interface  I
{
    void add(int a,int b);
}
class Addition
{
    public void sum(int i,int j)
    {
        System.out.println(i+j);
    }
}
public class MethodReference {
    public static void main(String[] args) {
        Addition a= new Addition();
        I i1=a ::sum;
        i1.add(5,7);
    }
}
