package jc01_2020.avramkov.Atest;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        int[] arr = {200,120,50,60,70,80,90,100,110,120};
/*        int count = 0;
        for(int current: arr){
            if(current > 90){
                continue;
            }
            current += 10;
            count++;
            System.out.println(current);
            if(count == 3) break;
        }*/

/*
        IntStream.of(200,120,50,60,70,80,90,100,110,120)
                .filter(x -> x <=90)
                .map(x -> x+10)
                .limit(3)
                .forEach(System.out::println);

*/

/*
        Map<String,Integer> map = new HashMap<>();
                map.entrySet().stream()
                        .filter(entry -> entry.getValue() < 10);

*/

/*
        Stream.of(200,120,50,60,70,80,90,100,110,120)
                .filter(x -> x <=90)
                .map(String::valueOf)
                .limit(3)
                .sorted((s1,s2) -> s1.compareTo(s2))
                .distinct()
                .forEach(System.out::println);
*/

/*        Stream.of(200,120,50,50,50,60,70,80,90,100,110,120)
                .filter(x -> x <=90)
                .map(x -> x+10)
                .peek(x -> System.out.println(x))
                .distinct()
                .limit(3)
                .forEach(System.out::println);*/

/*        Integer sum = Stream.of(200,120,50,50,50,60,70,80,90,100,110,120)
                .filter(x -> x <=90)
                .map(x -> x+10)
                .peek(x -> System.out.println(x))
                .distinct()
                .limit(3)
                .reduce((x1,x2) -> x1+x2)
                .get();
        System.out.println(sum);

        */

/*
       boolean sum = Stream.of(200,120,50,50,50,60,70,80,90,100,110,120)
                .filter(x -> x <=90)
                .map(x -> x+10)
                .distinct()
                .limit(3)
                .anyMatch(x -> x <60);
        System.out.println(sum);
*/

        String str = Stream.of(200,120,50,50,50,60,70,80,90,100,110,120)
                .filter(x -> x <=90)
                .map(x -> x+10)
                .map(String::valueOf)
/*                .distinct()
                .limit(3)*/
                .collect(Collectors.joining(","));
        System.out.println(str);


    }
}
