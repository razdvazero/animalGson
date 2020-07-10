package Animals;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.gson.*;

public class gson {
    String name;
    String type;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public static void main(String[] args) {

        Animal horse = new Horse();
        horse.name("anton");
        horse.type();

        Animal lion = new Lion();
        lion.name("oleg");
        lion.type();

        Gson gson = new Gson();

        String JSON  = gson.toJson(horse);
        System.out.println (JSON);

        String JSON2  = gson.toJson(lion);
        System.out.println (JSON2);

        File folder = new File("d:/IntelliJ IDEA Community Edition 2020.1.2/test");


        try (Writer writer = new FileWriter(folder + "/test.txt", true)) {
            Gson write = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            write.toJson(horse, writer);
            write.toJson(lion, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}