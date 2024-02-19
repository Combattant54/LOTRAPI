package fr.combattant54.lotrapi.role.impl;

import fr.combattant54.lotrapi.game.WereWolfAPI;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import fr.combattant54.lotrapi.basekeys.Prefix;
import fr.combattant54.lotrapi.enums.StatePlayer;
import fr.combattant54.lotrapi.events.roles.SelectionEndEvent;
import fr.combattant54.lotrapi.role.interfaces.IPower;
import org.bukkit.event.EventHandler;

public abstract class RoleWithLimitedSelectionDuration extends RoleImpl implements IPower {

    private boolean power = true;

    public RoleWithLimitedSelectionDuration(WereWolfAPI game, IPlayerWW playerWW) {
        super(game, playerWW);
    }

    @EventHandler
    public void onSelectionEnd(SelectionEndEvent event) {

        if (!hasPower()) return;

        setPower(false);

        if (!getPlayerWW().isState(StatePlayer.ALIVE)) {
            return;
        }

        getPlayerWW().sendMessageWithKey(Prefix.RED, "werewolf.check.end_selection");
    }

    @Override
    public final void setPower(boolean power) {
        this.power = power;
    }

    @Override
    public final boolean hasPower() {
        return this.power;
    }
}
