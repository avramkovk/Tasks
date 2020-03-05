package jc01_2020.avramkov.Atest;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest {

    public static void main(String[] args) {

        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");

        //Map -> Stream -> Filter -> Map
        Map<Integer, String> collect = HOSTING.entrySet().stream()
                .filter(map -> map.getKey() == 2)
               // .peek(v-> HOSTING.put(map.getKey(),"f"))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        System.out.println(collect); //output : {2=heroku.com}

        Map<Integer, String> collect2 = HOSTING.entrySet().stream()
                .filter(map -> map.getKey() == 4)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(collect2); //output : {1=linode.com, 2=heroku.com, 3=digitalocean.com}

    }

}
