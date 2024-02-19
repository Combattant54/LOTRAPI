package fr.combattant54.lotrapi.events.random_events;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsPlayer;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsTarget;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.swap_event")
public class SwapEvent extends Event implements Cancellable {


    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final IPlayerWW playerWW1;
    private final IPlayerWW playerWW2;
    private boolean cancel = false;

    public SwapEvent(IPlayerWW playerWW1, IPlayerWW playerWW2) {
        this.playerWW1 = playerWW1;
        this.playerWW2 = playerWW2;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    @StatisticsPlayer
    public IPlayerWW getPlayerWW1() {
        return playerWW1;
    }

    @StatisticsTarget
    public IPlayerWW getPlayerWW2() {
        return playerWW2;
    }
}

