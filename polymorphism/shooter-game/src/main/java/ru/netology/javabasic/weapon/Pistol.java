package ru.netology.javabasic.weapon;

public class Pistol extends Weapon {
    @Override
    public void shot() {
        System.out.println("Пиф-паф! (Пистолет)");
    }
}
