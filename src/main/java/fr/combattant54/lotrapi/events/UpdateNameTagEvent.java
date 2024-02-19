package fr.combattant54.lotrapi.events;

import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class UpdateNameTagEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final UUID uuid;

    public UpdateNameTagEvent(IPlayerWW playerWW) {
        this.uuid = playerWW.getUUID();
    }


    public UpdateNameTagEvent(Player player) {
        this.uuid = player.getUniqueId();
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public UUID getUUID() {
        return this.uuid;
    }

}