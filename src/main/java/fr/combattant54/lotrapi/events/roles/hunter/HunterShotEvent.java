package fr.combattant54.lotrapi.events.roles.hunter;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.hunter_shoot_event")
public class HunterShotEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public HunterShotEvent(IPlayerWW sourceWW, IPlayerWW targetWW) {
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
