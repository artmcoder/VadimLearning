package lesson2.interfaces.core;

public class Cat implements Animal {
    @Override
    public void breath() {
        System.out.println("Кошка дышит лёгкими");
    }
}
