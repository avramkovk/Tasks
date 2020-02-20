package jc01_2020.avramkov.car;

public class Car {

  private Model model;
  private int size;

    public Car(Model model, int size) {
        this.model = model;
        this.size = size;
    }
    
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }




}
