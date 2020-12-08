package io.github.ph1lou.werewolfapi.events;

import io.github.ph1lou.werewolfapi.PlayerWW;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class NewWereWolfEvent extends Event {


    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final PlayerWW playerWW;

    public NewWereWolfEvent(PlayerWW playerWW){
        this.playerWW = playerWW;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public PlayerWW getPlayerWW() {
        return playerWW;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

}