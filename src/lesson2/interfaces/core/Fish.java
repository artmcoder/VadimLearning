package lesson2.interfaces.core;

public class Fish implements Animal {
    @Override
    public void breath() {
        System.out.println("Рыба дышит жабрами");
    }
}
