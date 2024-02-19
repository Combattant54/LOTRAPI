package fr.combattant54.lotrapi.role.impl;

import fr.combattant54.lotrapi.game.WereWolfAPI;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;

public abstract class RoleWereWolf extends RoleImpl {


    public RoleWereWolf(WereWolfAPI game, IPlayerWW playerWW) {
        super(game, playerWW);
    }


    @Override
    public boolean isWereWolf() {
        return true;
    }
}
