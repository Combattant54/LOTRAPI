package fr.combattant54.lotrapi.events.roles.angel;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.angel_target_death")
public class AngelTargetDeathEvent extends SelectionEvent {


    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public AngelTargetDeathEvent(IPlayerWW playerWW, IPlayerWW targetWW) {
        super(playerWW, targetWW);
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
