package org.knit;

import org.knit.lab2.task3.Task3;
import org.knit.lab2.task4.Task4;
import org.knit.lab3.*;

public class Main {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        task1.execute();
//
//        Task2 task2 = new Task2();
//        task2.execute();

//        Task3 task3 = new Task3();
//        task3.execute();
//        Task4 task4 = new Task4();
//        task4.execute();
        AttackerPriest attackerPriest = new AttackerPriest("АтакерПрист");
        Guard guard = new Guard("Гард");
        Priest priest = new Priest("Хилер");
        Mage mage = new Mage("Маг");
        Warrior warrior = new Warrior("Орк");
        System.out.println(guard);
        System.out.println(mage);

        mage.attack(guard);
        System.out.println(mage);
        System.out.println(guard);
        attackerPriest.attack(warrior);
        System.out.println(warrior);
        attackerPriest.heal(warrior);
        System.out.println(warrior);
        warrior.move(5,5);
        System.out.println(warrior);
        warrior.move(5,5);
        System.out.println(warrior);
        mage.spell(warrior);
        System.out.println(warrior);
    }
}
