package ru.netology.javabasic;

import ru.netology.javabasic.weapon.*;

class Player {
    private final Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new WaterGun(),
                new Automat(),
                new Pistol(),
                new Rpg(),
                new Slingshot()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < 0 || slot >= weaponSlots.length) {
            System.out.println("Вы выбрали несуществующий слот. Попробуйте ещё раз");
            return;
        }
        weaponSlots[slot].shot();
    }
}