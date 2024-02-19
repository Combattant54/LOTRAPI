package fr.combattant54.lotrapi.events.roles.devoted_servant;

import fr.combattant54.lotrapi.annotations.TellableStoryEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.devoted_servant_event")
@TellableStoryEvent
public class DevotedServantEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public DevotedServantEvent(IPlayerWW playerWW, IPlayerWW targetUUID) {
        super(playerWW, targetUUID);

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

