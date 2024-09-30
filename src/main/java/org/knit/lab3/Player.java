package org.knit.lab3;

public abstract class Player {
    private String Name;
    private int currentHealth;
    private int maxHealth;
    private int x_position = 0;
    private int y_position = 0;
    private int damage;
    private int armor;
    private boolean isAlive;

    public int getArmor() {
        return armor;
    }


    protected void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    protected void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }


    protected void setX_position(int x_position) {
        this.x_position += x_position;
    }

    protected void setY_position(int y_position) {
        this.y_position += y_position;
    }

    public int getX_position() {
        return x_position;
    }

    public int getY_position() {
        return y_position;
    }

    protected void setDamage(int damage) {
        this.damage = damage;
    }

    protected void setArmor(int armor) {
        this.armor = armor;
    }

    protected void setAlive(boolean alive) {
        isAlive = alive;
    }

    protected void setName(String name) {
        Name = name;
    }

    protected abstract void increaseHealth(int healPower);

    public int getDamage() {
        return damage;
    }

    protected abstract void decreaseHealth(int damagePower);

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public abstract void move(int x, int y);

    @Override
    public String toString() {
        return "Player{" +
                "Name='" + Name + '\'' +
                ", currentHealth=" + currentHealth +
                ", maxHealth=" + maxHealth +
                ", x_position=" + x_position +
                ", y_position=" + y_position +
                ", damage=" + damage +
                ", armor=" + armor +
                ", isAlive=" + isAlive +
                '}';
    }
}
