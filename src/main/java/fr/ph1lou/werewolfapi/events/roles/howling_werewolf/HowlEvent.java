package fr.ph1lou.werewolfapi.events.roles.howling_werewolf;

import fr.ph1lou.werewolfapi.annotations.statistics.*;
import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

@StatisticsEvent(key = "werewolf.werewolf_howler")
public class HowlEvent extends Event implements Cancellable {

    private final IPlayerWW playerWW;
    private final Set<IPlayerWW> playerWWS;
    private boolean cancel=false;
    private int notWerewolfSize;

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public HowlEvent(IPlayerWW playerWW, Set<IPlayerWW> playerWWS, int werewolfSize){
        this.playerWW = playerWW;
        this.playerWWS = playerWWS;
        this.notWerewolfSize = werewolfSize;
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

    @StatisticsTargets
    public Set<IPlayerWW> getPlayerWWS() {
        return this.playerWWS;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel=cancel;
    }

    @StatisticsExtraInt
    public int getNotWerewolfSize() {
        return this.notWerewolfSize;
    }

    public void setNotWerewolfSize(int werewolfSize) {
        this.notWerewolfSize = werewolfSize;
    }
}

