package fr.combattant54.lotrapi.events.roles.bloodthirsty_werewolf;

import fr.combattant54.lotrapi.annotations.TellableStoryEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@TellableStoryEvent
@StatisticsEvent(key = "werewolf.bloodthirsty_werewolf_hunt_down_event")
public class BloodthirstyWerewolfHuntDownEvent extends SelectionEvent {
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList(){
        return HANDLERS_LIST;
    }

    public BloodthirstyWerewolfHuntDownEvent(IPlayerWW playerWW, IPlayerWW targetWW) {
        super(playerWW, targetWW);
    }
}
