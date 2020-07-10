package Animals;

import Food.Food;

public abstract class Animal {

    public String name;
    public String type;


    public abstract void name(String name);
    public abstract void type();

    public abstract void eat(Food food);
}
