package org.example;
import java.util.ArrayList;

public class Box<Obj extends Fruit> {
    private ArrayList<Obj> box = new ArrayList<>();
    public Box(){}

    public void addFruit(Obj fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for(Obj o : box){
            weight += o.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        if(getWeight() == anotherBox.getWeight()) {
            return true;
        }
        else{
            return false;
        }
    }

    public void moveTo(Box <Obj>anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }


}

