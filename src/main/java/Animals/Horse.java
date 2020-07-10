package Animals;

public class Horse extends herbivore {

    @Override
    public void name(String name) {
        this.name=name;
    }

    @Override
    public void type() {
        this.type="Лошадь";
    }
}