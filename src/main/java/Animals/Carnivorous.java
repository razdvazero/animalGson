package Animals;

import Animals.Animal;
import Food.Meat;
import Food.Food;

public abstract class Carnivorous extends Animal {

/*
    @Override
    public void eat(String food) {
        if (food=="мясо")
            System.out.println("потребляет");
        else
            System.out.println("не есть это");
    }
*/
@Override
public void eat(Food food) {
    if (food instanceof Meat) {
        System.out.println(name + " ест " + food);
    } else {
        System.out.println(name + " не ест " + food);
    }
}
}