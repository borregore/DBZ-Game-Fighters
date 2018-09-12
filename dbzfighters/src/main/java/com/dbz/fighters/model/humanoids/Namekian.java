package com.dbz.fighters.model.humanoids;

import com.dbz.fighters.model.Fighter;
import com.dbz.fighters.type.FighterType;

public class Namekian extends Fighter implements Humanoid {

    private boolean _fuse = true;
    private int _powerBoost = 1;

    public Namekian(String name) {
        setFighterName(name);
        setType(FighterType.NAMEKIAN);
        setCurrentLife(Fighter.DEFAULT_LIFE_POINTS);
    }

    public int eat() {
        System.out.println(getFighterName() + " just ate some food!!!!");
        int currentLife = getCurrentLife();
        setCurrentLife(currentLife + 500);
        return 0;

    }

    public int fuse() {
        if (_fuse) {
            System.out.println(getFighterName() + " is fusing with another namekian!!!!!");
            _powerBoost++;
            _fuse = false;
            return 0;
        }

        System.out.println("the namekian can't fuse twice.");
        return 0;
    }

    @Override
    public int getPowerBoost() {
        return _powerBoost;
    }
}
