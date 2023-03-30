package Lecture_03.Ex004.ExBeverage;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage 
            implements Iterable<Ingredient> {
    public List<Ingredient> components;
    int index;
    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){
        boolean flag = false;
        for (Ingredient ingredient : components) {
            if (ingredient.toString() == component.toString()) {
                flag = true;
                break;
            }
        }
        if (!flag)
            components.add(component);
        else System.out.println(component + " уже есть в составе");
    }

}