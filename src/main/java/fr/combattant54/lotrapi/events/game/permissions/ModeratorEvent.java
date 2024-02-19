package fr.combattant54.lotrapi.events.game.permissions;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class ModeratorEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final UUID playerUUID;
    private boolean isModerator;

    public ModeratorEvent(UUID playerUUID, boolean isModerator) {
        this.playerUUID = playerUUID;
        this.isModerator = isModerator;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }


    public boolean isModerator() {
        return isModerator;
    }


    public void setModerator(boolean b) {
        this.isModerator = b;
    }
}