package fr.combattant54.lotrapi.events.game.life_cycle;

import fr.combattant54.lotrapi.annotations.TellableStoryEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StatisticsEvent(key = "werewolf.kill_event")
@TellableStoryEvent
public class PlayerWWKillEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public PlayerWWKillEvent(@Nullable IPlayerWW killerWW, IPlayerWW playerWW) {
        super(killerWW, playerWW);
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
