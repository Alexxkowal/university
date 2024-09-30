package org.knit.lab3;

public class Warrior extends Player implements Damager{
    public Warrior(String name){
        setMaxHealth(150);
        setCurrentHealth(150);
        setAlive(true);
        setArmor(5);
        setDamage(20);
        setName(name);
        setY_position(0);
        setX_position(0);

    }
    public void attack(Player player){
        int damage = getDamage();
        player.decreaseHealth(damage);
    }

    @Override
    protected void increaseHealth(int healPower) {
        int currH = getCurrentHealth();
        currH += healPower;
        if (currH >= getMaxHealth()) {
            setCurrentHealth(getMaxHealth());
        } else {
            setCurrentHealth(currH);
        }
    }

    @Override
    protected void decreaseHealth(int damagePower) {
        int currentH = getCurrentHealth();
        currentH = currentH + getArmor() - damagePower;
        if( currentH<= 0){
            setCurrentHealth(0);
            setAlive(false);
        }
        else{
            setCurrentHealth(currentH);
        }

    }
    public void move(int x, int y) {
        setX_position(x);
        setY_position(y);
    }
}
