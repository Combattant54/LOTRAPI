package fr.combattant54.lotrapi;

import fr.minuskube.inv.InventoryManager;
import fr.combattant54.lotrapi.game.WereWolfAPI;
import fr.combattant54.lotrapi.registers.IRegisterManager;
import fr.combattant54.lotrapi.statistics.impl.GameReview;

import java.util.List;

/**
 * @author Ph1Lou
 */

@SuppressWarnings("unused")

public interface GetWereWolfAPI {

    /**
     * Get Current Game
     */
    WereWolfAPI getWereWolfAPI();

    /**
     * Get Register Manager
     */
    IRegisterManager getRegisterManager();

    /**
     * Get SmartInvs Inventory Manager
     */
    InventoryManager getInvManager();

    /**
     * Load Previous Game Stats
     * Not implemented Yet
     */
    List<GameReview> loadPreviousGames();
}