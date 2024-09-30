package org.knit.lab3;

public class Mage extends Player implements Damager {
    private final int spellDamage;

    public Mage(String name){
        setMaxHealth(100);
        setCurrentHealth(100);
        setAlive(true);
        setArmor(5);
        setDamage(50);
        setName(name);
        setY_position(0);
        setX_position(0);
        this.spellDamage = 50;

    }
    public void attack(Player player){
        int damage = getDamage();
        player.decreaseHealth(damage);
    }

    @Override
    protected void increaseHealth(int healPower) {
        int currH = getCurrentHealth();
        currH += healPower;
        if (currH>= getMaxHealth()){
            currH = getMaxHealth();
            setCurrentHealth(currH);
        }
        else {
            setCurrentHealth(currH);
        }
    }

    @Override
    protected void decreaseHealth(int damagePower) {
        int currentH = getCurrentHealth();
        currentH = currentH + getArmor() - damagePower;
        if (currentH <= 0){
            setCurrentHealth(0);
            setAlive(false);
        }
        else {
            setCurrentHealth(currentH);
        }
    }
    public void move(int x, int y) {
        setX_position(x);
        setY_position(y);
    }
    public void spell(Player player){
        player.decreaseHealth(spellDamage);
        System.out.println("Применено заклинание");
    }
}
