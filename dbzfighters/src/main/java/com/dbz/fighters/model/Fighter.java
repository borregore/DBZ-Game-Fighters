package com.dbz.fighters.model;

import com.dbz.fighters.type.FighterType;

public abstract class Fighter {
    protected static final int DEFAULT_LIFE_POINTS = 10000;

    private boolean _shouldBlock = false;
    private String _fighterName;
    private boolean _isInSky = false;
    private int _ki;
    private int _life;
    private FighterType _type;
    private boolean _shouldWaitForSimpleKiBlast;
    private boolean _shouldWaitForSuperKiBlast;

    public FighterType getType() {
        return _type;
    }

    protected void setType(FighterType type) {
        _type = type;
    }

    public int getCurrentLife() {
        return _life;
    }

    protected void setCurrentLife(int life) {
        _life = life;
    }

    private void setCurrentKi(int ki) {
        _ki = ki;
    }

    private int getCurrentKi() {
        return _ki;
    }

    protected void setFighterName(String fighterName) {
        _fighterName = fighterName;
    }

    public String getFighterName() {
        return _fighterName;
    }

    public int fly() {
        if (_isInSky) {
            System.out.println(_fighterName + " just flew down from the sky.");
            _isInSky = false;
            return 0;
        }

        System.out.println(_fighterName + " just flew to the sky.");
        _isInSky = true;
        return 0;
    }

    public int block() {
        System.out.println(_fighterName + " is getting ready  for something!!");
        _shouldBlock = true;
        return 0;
    }


    public void takeDamage(int damage) {
        if (damage == 0 || _shouldBlock) {
            System.out.println(_fighterName + " didn't receive any damage.");
            _shouldBlock = false;
        } else {
            System.out.println(_fighterName + " just received " + damage + " of damage!!");
            int currentLife = getCurrentLife() - damage;
            setCurrentLife(currentLife);
        }

    }

    public int kick() {
        System.out.println(getFighterName() + " has thrown a kick!");
        return 300 * getPowerBoost();
    }

    public int punch() {
        System.out.println(getFighterName() + " has thrown a punch!");
        return 100 * getPowerBoost();
    }

    public int powerUp(int powerUp) {
        System.out.println(getFighterName() + " is getting ready  for something!!");
        int currentKi = getCurrentKi();
        setCurrentKi(currentKi + powerUp);
        return 0;
    }

    public int simpleKiBlast(int damage, int kiConsumption) {
        if (_shouldWaitForSimpleKiBlast) {
            System.out.println(getFighterName() + " has thrown a simple blast.");
            int currentKi = getCurrentKi();
            setCurrentKi(currentKi - (kiConsumption * getPowerBoost()));
            _shouldWaitForSimpleKiBlast = false;
            return damage * getPowerBoost();
        }

        System.out.println(getFighterName() + " is getting ready  for something!!");
        _shouldWaitForSimpleKiBlast = true;
        return 0;
    }

    public int superKiBlast(int damage, int  kiConsumption) {
        if (_shouldWaitForSuperKiBlast) {
            System.out.println(getFighterName() + " has thrown his super blast!!!!");
            int currentKi = getCurrentKi();
            setCurrentKi(currentKi - (kiConsumption * getPowerBoost()));
            _shouldWaitForSuperKiBlast = false;
            return damage * getPowerBoost();
        }

        System.out.println(getFighterName() + " is getting ready  for something!!");
        _shouldWaitForSuperKiBlast = true;
        return 0;
    }

    public abstract int getPowerBoost();

}
