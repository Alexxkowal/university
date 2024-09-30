package org.knit.lab3;

public class AttackerPriest extends  Priest implements Damager{
    public AttackerPriest(String name) {
        super(name);
        setCurrentHealth(100);
        setAlive(true);
        setMaxHealth(100);
        setArmor(5);
        setDamage(50);
        setHealPower(15);
        setX_position(0);
        setY_position(0);
    }

    @Override
    public void heal(Player player) {
        super.heal(player);
    }

    @Override
    protected void decreaseHealth(int damagePower) {
        super.decreaseHealth(damagePower);
    }

    @Override
    protected void increaseHealth(int healPower) {
        super.increaseHealth(healPower);
    }

    @Override
    public void attack(Player player) {
        int damage = getDamage();
        player.decreaseHealth(damage);
    }
}
