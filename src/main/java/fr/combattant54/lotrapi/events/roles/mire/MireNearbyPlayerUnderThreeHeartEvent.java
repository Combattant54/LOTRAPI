package fr.combattant54.lotrapi.events.roles.mire;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.mire_nearby_player")
public class MireNearbyPlayerUnderThreeHeartEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();


    public MireNearbyPlayerUnderThreeHeartEvent(IPlayerWW playerWW, IPlayerWW selectionWW) {
        super(playerWW, selectionWW);
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

