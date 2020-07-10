import Animals.Animal;
import Animals.Giraffe;
import Animals.Horse;
import Food.Food;
import Food.Apple;
import Food.AntelopeMeat;
import Food.Grass;
import Food.BuffaloMeat;
import Animals.herbivore;

import java.util.Scanner;
import java.util.HashMap;

public class PenHerbivore {
    private static int count = 1;
    private static int capacity;
    private static String animal;
    private static String action;
    static private HashMap<String, String> map = new HashMap<String, String>();
    static private Food[] food = {new AntelopeMeat(), new BuffaloMeat(), new Apple(), new Grass()};

    /**
     * Я так и не разобрался как автоматизировать создание объектов класса, поэтому получилась такая стена однотипного текста,
     * бессмысленного и беспощадного. Можно бы было клепать всякие
     * horse1 horse2 до бесконечности но я ограничился 3. Можно бы было обойтись без них но задание
     * подразумевает наследование классов, поэтому надо использовать
     */

    public static void addAnimal(int count, String name) {
        if (count == 2 && animal.equals("лошадь")) {
            Animal horse1 = new Horse();
            horse1.name(name);
            horse1.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                horse1.eat(food[i]);
            }
            map.put(horse1.name, horse1.type);
        }
        if (count == 3 && animal.equals("лошадь")) {
            Animal horse2 = new Horse();
            horse2.name(name);
            horse2.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                horse2.eat(food[i]);
            }
            map.put(horse2.name, horse2.type);
        }
        if (count == 4 && animal.equals("лошадь")) {
            Animal horse3 = new Horse();
            horse3.name(name);
            horse3.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                horse3.eat(food[i]);
            }
            map.put(horse3.name, horse3.type);
        }

        if (count == 2 && animal.equals("жираф")) {
            Animal Giraffe1 = new Giraffe();
            Giraffe1.name(name);
            Giraffe1.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                Giraffe1.eat(food[i]);
            }
            map.put(Giraffe1.name, Giraffe1.type);
        }
        if (count == 3 && animal.equals("жираф")) {
            Animal Giraffe2 = new Giraffe();
            Giraffe2.name(name);
            Giraffe2.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                Giraffe2.eat(food[i]);
            }
            map.put(Giraffe2.name, Giraffe2.type);
        }
        if (count == 4 && animal.equals("жираф")) {
            Animal Giraffe3 = new Giraffe();
            Giraffe3.name(name);
            Giraffe3.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                Giraffe3.eat(food[i]);
            }
            map.put(Giraffe3.name, Giraffe3.type);
        }
    }


    public static void main(String[] args) {
        map.put("ДональдДак", "Утка");
        System.out.println("Введи размер вольера, не больше 4 а то бюджет не позволяет");
        Scanner EnterCapacity = new Scanner(System.in);
        capacity = EnterCapacity.nextInt();
        for (int i = 0; i <= capacity - 2; i++) {
            System.out.println("Введи кого хочешь добавить, выбирай: лошадь,жираф");
            Scanner EnterAnimal = new Scanner(System.in);
            Scanner AnimalCall = new Scanner(System.in);
            animal = EnterAnimal.nextLine();
            count++;
            if (animal.equals("лошадь") && count <= capacity) {
                System.out.println("Введи кличку для лошади");
                String Call = AnimalCall.nextLine();
                addAnimal(count, Call);
            } else if (animal.equals("жираф") && count <= capacity) {
                System.out.println("Введи кличку для жирафа");
                String Call = AnimalCall.nextLine();
                addAnimal(count, Call);
            }
            System.out.println(animal + " добавлен(а)");
            if (count == capacity)
                System.out.println("Вольер полностью заполнен");

        }
        System.out.println("Ты можешь подозвать животное из вольера по его кличке или покинуть зоопарк, можешь позвать утку, ее зовут ДональдДак");
        Scanner EnterAction = new Scanner(System.in);
        action = EnterAction.nextLine();
        if (action.equals("подозвать")) {
            while(action.equals("подозвать"))
            {
            System.out.println("Введи кличку животного");
            String name;
            name = EnterAction.nextLine();
            for (HashMap.Entry<String, String> hashMap : map.entrySet()) {
                if (hashMap.getKey().equals(name)) {
                    name = hashMap.getKey();
                    String type = hashMap.getValue();
                    System.out.println("К тебе подошел " + name + " из класса " + type);
                    System.out.println("Что дальше ?");
                    action = EnterAction.nextLine();
                }
                }
            }
        }
        if(action.equals("покинуть")) {
            System.out.println("Ты вышел из зоопрка");
        }
    }
}
