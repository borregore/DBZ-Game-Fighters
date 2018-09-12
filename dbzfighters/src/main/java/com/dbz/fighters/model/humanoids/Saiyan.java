package com.dbz.fighters.model.humanoids;

import com.dbz.fighters.model.Fighter;
import com.dbz.fighters.type.FighterType;

public class Saiyan extends Fighter implements Humanoid {

    private boolean _hasTail;
    private boolean _isSuperSaiyan;
    private int _powerBoost = 1;
    private boolean _isGreatApe;

    public Saiyan(boolean hasTail, String name) {
        _hasTail = hasTail;
        setFighterName(name);
        setType(FighterType.SAIYAN);
        setCurrentLife(Fighter.DEFAULT_LIFE_POINTS);
    }

    public int eat() {
        System.out.println(getFighterName() + " just ate some food!!!!");
        int currentLife = getCurrentLife();
        setCurrentLife(currentLife + 800);
        return 0;
    }

    public int transformIntoSuperSaiyan() {
        if (_isSuperSaiyan || _hasTail) {
            if(_hasTail){
                System.out.println(getFighterName() + " Can't turn into a super super saiyan because he has a tail");
                return 0;
            }

            System.out.println(getFighterName() + " Can't transform into super saiyan beacuse he's already super saiyan");
            return 0;
        }

        System.out.println(getFighterName() + " has turned into a super saiyan!!!!");
        _powerBoost += 2;
        _isSuperSaiyan = true;
        return 0;
    }

    public int transformIntoGreatApe() {
        if (_isGreatApe || !_hasTail) {
            if(!_hasTail){
                System.out.println(getFighterName() + " Can't transform to great ape beacuse he has no tail");
                return 0;
            }

            System.out.println(getFighterName() + "Can't transform into great ape because he is already transformed");
            return 0;
        }

        System.out.println(getFighterName() + " has turned into a great Ape!!!!");
        _powerBoost += 1;
        _isGreatApe = true;
        return 0;
    }

    @Override
    public int getPowerBoost() {
        return  _powerBoost;
    }
}
