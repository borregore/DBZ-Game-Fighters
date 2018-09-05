package com.dbz.fighters.service;

import com.dbz.fighters.model.Fighter;
import com.dbz.fighters.model.humanoids.Human;
import com.dbz.fighters.model.humanoids.Namekian;
import com.dbz.fighters.model.humanoids.Saiyan;
import com.dbz.fighters.model.nonhumanoid.Android;

import java.util.Scanner;

class FighterOptionsService {

    private static Scanner reader = new Scanner(System.in);

    private static int getSaiyanOptions(Saiyan saiyan) {
        System.out.println("What do you decide to do " + saiyan.getFighterName() + ":");
        System.out.println("\n1.- kick\n2.- punch\n3.- power up\n4.- simple ki blast\n5.- super ki blast\n6.- fly\n7.- block\n8.- eat\n9.- turn to super saiyan\n10.- turn to great ape");
        int option = reader.nextInt();
        int damage;
        switch (option) {
            case 1:
                damage = saiyan.kick();
                break;

            case 2:
                damage = saiyan.punch();
                break;

            case 3:
                damage = saiyan.powerUp(1000);
                break;

            case 4:
                damage = saiyan.simpleKiBlast(850, 800);
                break;

            case 5:
                damage = saiyan.superKiBlast(2000, 750);
                break;

            case 6:
                damage = saiyan.fly();
                break;

            case 7:
                damage = saiyan.block();
                break;

            case 8:
                damage = saiyan.eat();
                break;

            case 9:
                damage = saiyan.transformIntoSuperSaiyan();
                break;

            default:
                damage = saiyan.transformIntoGreatApe();
                break;

        }
        return damage;
    }

    private static int getAndroidOptions(Android android) {
        System.out.println("What do you decide to do " + android.getFighterName() + ":");
        System.out.println("\n1.- kick\n2.- punch\n3.- power up\n4.- simple ki blast\n5.- super ki blast\n6.- fly\n7.- block");
        int option = reader.nextInt();
        int damage;
        switch (option) {
            case 1:
                damage = android.kick();
                break;

            case 2:
                damage = android.punch();
                break;

            case 3:
                damage = android.powerUp(0);
                break;

            case 4:
                damage = android.simpleKiBlast(700, 0);
                break;

            case 5:
                damage = android.superKiBlast(1500, 0);
                break;

            case 6:
                damage = android.fly();
                break;

            default:
                damage = android.block();
                break;

        }
        return damage;
    }

    private static int getHumanOptions(Human human) {
        System.out.println("What do you decide to do " + human.getFighterName() + ":");
        System.out.println("\n1.- kick\n2.- punch\n3.- power up\n4.- simple ki blast\n5.- super ki blast\n6.- fly\n7.- block\n8.- eat");
        int option = reader.nextInt();
        int damage;
        switch (option) {
            case 1:
                damage = human.kick();
                break;

            case 2:
                damage = human.punch();
                break;

            case 3:
                damage = human.powerUp(500);
                break;

            case 4:
                damage = human.simpleKiBlast(650, 500);
                break;

            case 5:
                damage = human.superKiBlast(1200, 800);
                break;

            case 6:
                damage = human.fly();
                break;

            case 7:
                damage = human.block();
                break;

            default:
                damage = human.eat();
                break;

        }
        return damage;
    }

    private static int getNamekianOptions(Namekian namekian) {
        System.out.println("What do you decide to do " + namekian.getFighterName() + ":");
        System.out.println("\n1.- kick\n2.- punch\n3.- power up\n4.- simple ki blast\n5.- super ki blast\n6.- fly\n7.- block\n8.- eat\n9.- fuse with another namekian");
        int option = reader.nextInt();
        int damage;
        switch (option) {
            case 1:
                damage = namekian.kick();
                break;

            case 2:
                damage = namekian.punch();
                break;

            case 3:
                damage = namekian.powerUp(900);
                break;

            case 4:
                damage = namekian.simpleKiBlast(800, 700);
                break;

            case 5:
                damage = namekian.superKiBlast(1800, 1000);
                break;

            case 6:
                damage = namekian.fly();
                break;

            case 7:
                damage = namekian.block();
                break;

            case 8:
                damage = namekian.eat();
                break;

            default:
                damage = namekian.fuse();
                break;

        }
        return damage;
    }

    static int getFighterOptions(Fighter fighter){
        switch(fighter.getType()){
            case SAIYAN:
                Saiyan saiyan = (Saiyan) fighter;
                return getSaiyanOptions(saiyan);
            case NAMEKIAN:
                Namekian namekian = (Namekian) fighter;
                return getNamekianOptions(namekian);
            case ANDROID:
                Android android = (Android) fighter;
                return getAndroidOptions(android);
            case HUMAN:
                Human human = (Human) fighter;
                return getHumanOptions(human);
            default:
                System.out.println("the fighter's type is incorrect.");
                System.exit(1);
        }
        return 0;
    }
}
