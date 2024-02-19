package fr.combattant54.lotrapi.events.werewolf;

import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;


public class WereWolfChatEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final String message;

    public WereWolfChatEvent(IPlayerWW playerWW, IPlayerWW target, String message) {
        super(playerWW, target);
        this.message = message;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public String getMessage() {
        return message;
    }
}

