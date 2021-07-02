package lesson2.interfaces;

import lesson2.interfaces.core.Animal;
import lesson2.interfaces.core.Cat;
import lesson2.interfaces.core.Fish;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.breath();
    }
}
