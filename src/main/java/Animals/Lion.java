package Animals;

public class Lion extends Carnivorous {

    @Override
    public void name(String name) {
        this.name=name;
    }

    @Override
    public void type() {
        this.type="Лев";
    }
}