package com.dbz.fighters.controller;

import com.dbz.fighters.model.Fighter;
import com.dbz.fighters.service.GameEngineService;
import com.dbz.fighters.type.FighterType;

public class Main {
    public static void main(String [] args){
        System.out.println("Player 1: Which race would you like?");
        FighterType race = GameEngineService.chooseRace();
        Fighter character1 = GameEngineService.chooseCharacter(race);

        System.out.println("player 2: Which race would you like?");
        race = GameEngineService.chooseRace();
        Fighter character2 = GameEngineService.chooseCharacter(race);

        String result = GameEngineService.play(character1, character2);
        System.out.println(result);
    }
}
