package org.knit.lab3;

public class Guard extends Warrior {
    public Guard(String name) {
        super(name);
        setMaxHealth(130);
        setCurrentHealth(130);
        setAlive(true);
        setArmor(10);
        setDamage(50);
        setName(name);
        setY_position(0);
        setX_position(0);
    }

    @Override
    public void attack(Player player) {
        super.attack(player);
    }

    @Override
    protected void increaseHealth(int healPower) {
        super.increaseHealth(healPower);
    }

    @Override
    protected void decreaseHealth(int damagePower) {
        super.decreaseHealth(damagePower);
    }
}
