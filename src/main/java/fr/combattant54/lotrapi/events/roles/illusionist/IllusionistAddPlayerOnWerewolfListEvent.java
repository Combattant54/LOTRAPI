package fr.combattant54.lotrapi.events.roles.illusionist;

import fr.combattant54.lotrapi.annotations.TellableStoryEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.illusionist_add_player_event")
@TellableStoryEvent
public class IllusionistAddPlayerOnWerewolfListEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public IllusionistAddPlayerOnWerewolfListEvent(IPlayerWW playerWW, IPlayerWW sniffIPlayerWW) {
        super(playerWW, sniffIPlayerWW);
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