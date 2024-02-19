package fr.combattant54.lotrapi.events.roles.will_o_the_wisp;

import fr.combattant54.lotrapi.annotations.TellableStoryEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsPlayer;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.will_o_the_wisp_incendiary_madness")
@TellableStoryEvent
public class WillOTheWispIncendiaryMadnessEvent extends Event implements Cancellable {


    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final IPlayerWW playerWW;
    private boolean cancel = false;

    public WillOTheWispIncendiaryMadnessEvent(IPlayerWW playerWW) {
        this.playerWW = playerWW;
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
        return this.cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    @StatisticsPlayer
    public IPlayerWW getPlayerWW() {
        return playerWW;
    }
}
