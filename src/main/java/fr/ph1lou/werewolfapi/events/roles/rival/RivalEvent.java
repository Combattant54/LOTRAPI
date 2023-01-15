package fr.ph1lou.werewolfapi.events.roles.rival;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class RivalEvent extends Event {


    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

}

