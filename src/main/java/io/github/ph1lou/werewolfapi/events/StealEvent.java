
package io.github.ph1lou.werewolfapi.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class StealEvent extends Event {

    private final UUID newUUID;
    private final UUID oldUUID;
    private final String role;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public StealEvent(UUID newUUID, UUID oldUUID, String role){
        this.newUUID=newUUID;
        this.oldUUID=oldUUID;
        this.role=role;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public UUID getNewUUID() {
        return newUUID;
    }

    public UUID getOldUUID() {
        return oldUUID;
    }

    public String getRole() {
        return role;
    }
}
