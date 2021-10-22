package ss7_abstract_class_va_interface.thuc_hanh;

abstract class Animal {
    public abstract String makeSound();
}

class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
}

class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}

interface Edible {
    String howToEat();
}

abstract class Fruit implements Edible {
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}

public class LopAnimalVaInterfaceEdible {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        System.out.println(animals[0].makeSound());

        if (animals[0] instanceof Chicken) {
            Edible edibler = (Chicken) animals[0];
            System.out.println(edibler.howToEat());
        }
        System.out.println(animals[1].makeSound());

        if (animals[1] instanceof Chicken) {
            Edible edibler = (Chicken) animals[1];
            System.out.println(edibler.howToEat());
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}