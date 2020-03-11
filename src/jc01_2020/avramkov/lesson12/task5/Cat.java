package jc01_2020.avramkov.lesson12.task5;

class Cat {
    private String nameCat;
    private int lifeCat;

    public String getNameCat() {
        return nameCat;
    }

    public int getLifeCat() {
        return lifeCat;
    }

    public Cat(String nameCat, int lifeCat) {
        this.nameCat = nameCat;
        this.lifeCat = lifeCat;
    }

    static LifeCompare lifeCompare = (x, y) -> {

        if (x.getLifeCat() == y.getLifeCat()) {
            return "Коты имеют одинаковое количество жизней";
        } else if (x.getLifeCat() > y.getLifeCat()) {
            return x.getNameCat();
        }
        return y.getNameCat();
    };
}