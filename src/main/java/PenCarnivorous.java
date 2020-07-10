import Animals.Animal;
import Animals.Lion;
import Animals.Tiger;
import Animals.Carnivorous;
import Food.Food;
import Food.Apple;
import Food.AntelopeMeat;
import Food.Grass;
import Food.BuffaloMeat;

import java.util.Scanner;
import java.util.HashMap;

public class PenCarnivorous {
    private static int count = 0;
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
        if (count == 1 && animal.equals("лев")) {
            Animal Lion1 = new Lion();
            Lion1.name(name);
            Lion1.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                Lion1.eat(food[i]);
            }
            map.put(Lion1.name, Lion1.type);
        }
        if (count == 2 && animal.equals("лев")) {
            Animal Lion2 = new Lion();
            Lion2.name(name);
            Lion2.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                Lion2.eat(food[i]);
            }
            map.put(Lion2.name, Lion2.type);
        }
        if (count == 3 && animal.equals("лев")) {
            Animal Lion3 = new Lion();
            Lion3.name(name);
            Lion3.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                Lion3.eat(food[i]);
            }
            map.put(Lion3.name, Lion3.type);
        }
        if (count == 4 && animal.equals("лев")) {
            Animal Lion4 = new Lion();
            Lion4.name(name);
            Lion4.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                Lion4.eat(food[i]);
            }
            map.put(Lion4.name, Lion4.type);
        }

        if (count == 1 && animal.equals("тигр")) {
            Animal Tiger1 = new Tiger();
            Tiger1.name(name);
            Tiger1.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                Tiger1.eat(food[i]);
            }
            map.put(Tiger1.name, Tiger1.type);
        }
        if (count == 2 && animal.equals("тигр")) {
            Animal Tiger2 = new Tiger();
            Tiger2.name(name);
            Tiger2.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                Tiger2.eat(food[i]);
            }
            map.put(Tiger2.name, Tiger2.type);
        }
        if (count == 3 && animal.equals("тигр")) {
            Animal Tiger3 = new Tiger();
            Tiger3.name(name);
            Tiger3.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                Tiger3.eat(food[i]);
            }
            map.put(Tiger3.name, Tiger3.type);
        }
        if (count == 4 && animal.equals("тигр")) {
            Animal Tiger4 = new Tiger();
            Tiger4.name(name);
            Tiger4.type();
            System.out.println("Предпочтения в еде:");
            for (int i = 0; i <4 ; i++) {
                Tiger4.eat(food[i]);
            }
            map.put(Tiger4.name, Tiger4.type);
        }
    }


    public static void main(String[] args) {
        System.out.println("Введи размер вольера, не больше 4 а то бюджет не позволяет");
        Scanner EnterCapacity = new Scanner(System.in);
        capacity = EnterCapacity.nextInt();

        for (int i = 0; i <= capacity-1; i++) {
            System.out.println("Введи кого хочешь добавить, выбирай: лев,тигр");
            Scanner EnterAnimal = new Scanner(System.in);
            Scanner AnimalCall = new Scanner(System.in);
            animal = EnterAnimal.nextLine();
            count++;
            if (animal.equals("лев") && count <= capacity) {
                System.out.println("Введи кличку для животного");
                String Call = AnimalCall.nextLine();
                addAnimal(count, Call);
            }
            else if (animal.equals("тигр") && count <= capacity) {
                System.out.println("Введи кличку для животного");
                String Call = AnimalCall.nextLine();
                addAnimal(count, Call);
            }
            System.out.println(animal + " добавлен");
            if (count == capacity)
                System.out.println("Вольер полностью заполнен");

        }
        System.out.println("Ты можешь подозвать животное из вольера по его кличке или покинуть зоопарк");
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
