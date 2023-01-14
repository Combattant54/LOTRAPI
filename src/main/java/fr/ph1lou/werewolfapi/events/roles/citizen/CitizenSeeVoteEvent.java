package fr.ph1lou.werewolfapi.events.roles.citizen;

import fr.ph1lou.werewolfapi.annotations.statistics.StatisticsEvent;
import fr.ph1lou.werewolfapi.annotations.statistics.StatisticsPlayer;
import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

@StatisticsEvent(key = "werewolf.see_vote")
public class CitizenSeeVoteEvent extends Event implements Cancellable {

    private final IPlayerWW playerWW;
    private final Map<IPlayerWW,Integer> votes;
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean cancel=false;

    public CitizenSeeVoteEvent(IPlayerWW playerWW, Map<IPlayerWW,Integer> votes){
        this.playerWW = playerWW;
        this.votes =votes;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @StatisticsPlayer
    public IPlayerWW getPlayerWW() {
        return this.playerWW;
    }

    public Map<IPlayerWW,Integer> getVotes() {
        return votes;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel=cancel;
    }
}

