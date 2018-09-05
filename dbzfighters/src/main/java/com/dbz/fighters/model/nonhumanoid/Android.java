package com.dbz.fighters.model.nonhumanoid;

import com.dbz.fighters.model.Fighter;
import com.dbz.fighters.type.FighterType;

public class Android extends Fighter{

    private int _number;

    public Android(int number) {
        _number = number;
        setType(FighterType.ANDROID);
        setCurrentLife(Fighter.DEFAULT_LIFE_POINTS);
    }

    @Override
    public String getFighterName() {
        return _number + "";
    }

    @Override
    public int getPowerBoost() {
        System.out.println("androids don't have power boost");
        return 1;
    }
}
