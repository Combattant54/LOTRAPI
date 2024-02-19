package fr.combattant54.lotrapi.role.impl;

import fr.combattant54.lotrapi.game.WereWolfAPI;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;

public abstract class RoleNeutral extends RoleImpl {

    public RoleNeutral(WereWolfAPI game, IPlayerWW playerWW) {
        super(game, playerWW);
    }

    @Override
    public boolean isNeutral() {
        return !this.isWereWolf() && !this.isTransformedToVillager();
    }
}