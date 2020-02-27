package jc01_2020.avramkov.test1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Dog[] array = new Dog[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            scanner.nextLine();
            try {
                addDog(createDog());
            }catch (NullPointerException e){
                System.out.println("NullPointerException");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }

        }
    }


    static Dog createDog() {
        return new Random().nextBoolean() ? new Dog() : null;
    }

    static void addDog(Dog dog) {
        Random random = new Random();
int i = random.nextInt(20);
dog.print();
        array[i] = dog;
    }
}

