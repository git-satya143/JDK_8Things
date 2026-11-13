package com.strreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry");
        Stream<String> myStream=list.stream();

        String[] array={"apple","banana","cherry"};
        Stream<String> stream= Arrays.stream(array);

        Stream<Integer> integerStream=Stream.of(1,2,3,4,5);

        Stream<Integer> limit1=Stream.iterate(0,n->n+1).limit(10);
        limit1.forEach(System.out::println);

        Stream<Integer> limit2= Stream.generate(()-> (int) (Math.random() * 100)).limit(20);
        limit2.forEach(System.out::print);
        limit2.collect(Collectors.toList());
    }
}
