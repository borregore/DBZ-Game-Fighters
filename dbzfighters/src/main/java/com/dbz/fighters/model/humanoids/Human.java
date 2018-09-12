package com.dbz.fighters.model.humanoids;

import com.dbz.fighters.model.Fighter;
import com.dbz.fighters.type.FighterType;

public class Human extends Fighter implements Humanoid {

    private int _senzuBean = 3;

    public Human(String name) {
        setCurrentLife(Fighter.DEFAULT_LIFE_POINTS);
        setFighterName(name);
        setType(FighterType.HUMAN);
    }

    public int eat() {
        if (_senzuBean > 0) {
            System.out.println(getFighterName() + " just ate a senzu bean!!!!");
            setCurrentLife(Fighter.DEFAULT_LIFE_POINTS);
            _senzuBean--;
            return 0;
        }

        System.out.println(getFighterName() + " ran out of senzu beans!!!!");
        return 0;

    }

    @Override
    public int getPowerBoost() {
        return 1;
    }
}
