package Animals;

import Animals.Carnivorous;

public class Tiger extends Carnivorous {

    @Override
    public void name(String name) {
        this.name=name;
    }

    @Override
    public void type() {
        this.type="Тигр";
    }
}