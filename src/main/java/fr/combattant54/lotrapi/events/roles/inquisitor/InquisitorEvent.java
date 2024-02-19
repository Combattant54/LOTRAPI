package fr.combattant54.lotrapi.events.roles.inquisitor;

import fr.combattant54.lotrapi.annotations.TellableStoryEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.inquisitor_event")
@TellableStoryEvent
public class InquisitorEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public InquisitorEvent(IPlayerWW sourceWW, IPlayerWW targetWW) {
        super(sourceWW, targetWW);
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
