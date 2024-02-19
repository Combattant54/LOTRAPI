package fr.combattant54.lotrapi.commands;

import fr.combattant54.lotrapi.game.WereWolfAPI;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;

public interface ICommandRole {

    void execute(WereWolfAPI game, IPlayerWW player, String[] args);

}
