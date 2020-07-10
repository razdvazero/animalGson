package Animals;

public class Giraffe extends herbivore {

    @Override
    public void name(String name) {
        this.name=name;
    }

    @Override
    public void type() {
        this.type="Жираф";
    }
}