package org.knit.lab3;

public class Priest extends  Player implements Healer{
    int healpower;
    public Priest(String name){
        setMaxHealth(100);
        setCurrentHealth(100);
        setAlive(true);
        setArmor(5);
        setDamage(50);
        setName(name);
        setY_position(0);
        setX_position(0);
        this.healpower = 20;
    }
    public void heal(Player player){
        int heal = getHealpower();
        player.increaseHealth(heal);
    }

    @Override
    protected void decreaseHealth(int damagePower) {
        int currH = getCurrentHealth();
        currH = currH - damagePower + getArmor();
        if (currH <= 0){
            setAlive(false);
            setCurrentHealth(0);
        }
        else{
            setCurrentHealth(currH);
        }

    }

    @Override
    public void move(int x, int y) {
        setX_position(x);
        setY_position(y);
    }

    @Override
    protected void increaseHealth(int healPower) {
        int currH = getCurrentHealth();
        currH += healPower;
        if (currH>= getMaxHealth()){
            setCurrentHealth(getMaxHealth());
        }
        else{
            setCurrentHealth(currH);
        }
    }
    protected void setHealPower(int heal){
        this.healpower = heal;
    }
    protected int getHealpower(){
        return healpower;
    }
}
