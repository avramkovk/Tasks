package jc01_2020.avramkov.car;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Model[] values = Model.values();

        for (int i = 0; i < 50; i++) {

            cars.add(new Car(values[(int) (Math.random() * (values.length))], (int) (Math.random() * 10)));
        }

        for(Car c: cars){
            System.out.println("Model = " + c.getModel() + " size = " + c.getSize());
        }

        Map<Model, Integer> map = new TreeMap<>(new Comparator<Model>() {
            @Override
            public int compare(Model o1, Model o2) {
                return o1.toString().compareTo(o2.toString());

            }
        });
        int count = 0;
        for (int i = 0; i < 50; i++) {
            count = 0;
            Model model = cars.get(i).getModel();
            if (!map.containsKey(model)) {

                for (Car c : cars) {
                    if (c.getModel() == model) {
                        count+=c.getSize();
                    }
                }
                map.put(model, count);
            }
        }
        System.out.println(map);
    }
}
