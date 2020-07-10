package Animals;

import Animals.Animal;
import Food.Meat;
import Food.Food;

public abstract class herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(name + " не ест " + food);
        } else {
            System.out.println(name + " ест " + food);
        }
    }
}