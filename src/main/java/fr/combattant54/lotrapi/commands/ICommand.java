package fr.combattant54.lotrapi.commands;

import fr.combattant54.lotrapi.game.WereWolfAPI;
import org.bukkit.entity.Player;

public interface ICommand {

    void execute(WereWolfAPI game, Player player, String[] args);

}
