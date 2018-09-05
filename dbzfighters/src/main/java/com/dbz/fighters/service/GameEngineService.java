package com.dbz.fighters.service;

import com.dbz.fighters.model.Fighter;
import com.dbz.fighters.model.humanoids.Human;
import com.dbz.fighters.model.humanoids.Namekian;
import com.dbz.fighters.model.humanoids.Saiyan;
import com.dbz.fighters.model.nonhumanoid.Android;
import com.dbz.fighters.type.FighterType;

import java.util.Scanner;

public class GameEngineService {

    private static final String HUMAN_RACE = "HUMAN";
    private static final String SAIYAN_RACE = "SAIYAN";
    private static final String NAMEKIAN_RACE = "NAMEKIAN";
    private static final String ANDROID_RACE = "ANDROID";
    private static boolean PLAYER1_TURN = true;
    private static Scanner reader = new Scanner(System.in);

    public static Fighter chooseCharacter(FighterType type) {
        System.out.flush();
        switch (type) {
            case SAIYAN:
                return createSaiyan();
            case ANDROID:
                return createAndroid();
            case NAMEKIAN:
                return createNamekian();
            case HUMAN:
                return createHuman();
            default:
                System.out.println("That's not a race");
                System.exit(1);
        }

        return null;
    }

    private static Fighter createHuman() {
        String name;
        System.out.println("introduce the name of your human.");
        name = reader.nextLine();
        return new Human(name);
    }

    private static Fighter createNamekian() {
        String name;
        System.out.println("introduce the name of your namekian.");
        name = reader.nextLine();
        return new Namekian(name);
    }

    private static Fighter createAndroid() {
        System.out.println("introduce the number of your android.");
        int number = reader.nextInt();
        return new Android(number);
    }

    private static Fighter createSaiyan() {
        String name;
        System.out.println("introduce the name of your saiyan.");
        name = reader.nextLine();
        System.out.println("Does your saiyan have a tail? (yes/no)");
        String tail = reader.nextLine();
        boolean hasTail = hasTail(tail);
        return new Saiyan(hasTail, name);
    }

    private static boolean hasTail(String hasTail) {
        return hasTail.toUpperCase().equals("YES");
    }

    public static FighterType chooseRace() {
        System.out.println(HUMAN_RACE);
        System.out.println(ANDROID_RACE);
        System.out.println(SAIYAN_RACE);
        System.out.println(NAMEKIAN_RACE);
        System.out.println("Please after writing the race press enter to continue...");
        String race = reader.nextLine();
        System.out.flush();
        switch (race.toUpperCase()) {
            case HUMAN_RACE:
                return FighterType.HUMAN;
            case ANDROID_RACE:
                return FighterType.ANDROID;
            case NAMEKIAN_RACE:
                return FighterType.NAMEKIAN;
            case SAIYAN_RACE:
                return FighterType.SAIYAN;
            default:
                return chooseRace();
        }
    }

    public static String play(Fighter fighter1, Fighter fighter2) {
        while (fighter1.getCurrentLife() >= 0 || fighter2.getCurrentLife() >= 0) {
            if (PLAYER1_TURN) {
                int damage = FighterOptionsService.getFighterOptions(fighter1);
                fighter2.takeDamage(damage);
                PLAYER1_TURN = false;
            } else {
                int damage = FighterOptionsService.getFighterOptions(fighter2);
                fighter1.takeDamage(damage);
                PLAYER1_TURN = true;
            }
        }

        return getWinner(fighter1, fighter2);
    }

    private static String getWinner(Fighter fighter1, Fighter fighter2) {
        if (fighter1.getCurrentLife() <= 0) {
            return fighter2.getFighterName() + " is the winner!!!";
        }

        return fighter2.getFighterName() + " is the Winner!!!";
    }
}
