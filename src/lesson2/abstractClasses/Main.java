package lesson2.abstractClasses;

import lesson2.abstractClasses.core.Animal;
import lesson2.abstractClasses.core.Fish;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Fish();
        animal.breath();
    }
}
