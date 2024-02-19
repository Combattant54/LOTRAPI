package fr.combattant54.lotrapi.events.lovers;

import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class AroundLoverEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final Set<IPlayerWW> playerWWS;

    public AroundLoverEvent(Set<IPlayerWW> playerWWS) {
        this.playerWWS = playerWWS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public Set<? extends IPlayerWW> getPlayerWWS() {
        return playerWWS;
    }

    public void addPlayer(IPlayerWW playerWW) {
        this.playerWWS.add(playerWW);
    }


}

