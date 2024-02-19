package fr.combattant54.lotrapi.events.roles.servitor;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * @author Héphaïsto
 * Event called when a master kill a servitor for the first time, the master is now definitive
 */

@StatisticsEvent(key = "werewolf.servitor_definitive_master")
public class ServitorDefinitiveMasterEvent extends SelectionEvent {
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public ServitorDefinitiveMasterEvent(IPlayerWW servitor, IPlayerWW master) {
        super(servitor, master);
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }
}
