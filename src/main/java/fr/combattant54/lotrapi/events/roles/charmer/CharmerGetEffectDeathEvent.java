package fr.combattant54.lotrapi.events.roles.charmer;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsPlayer;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsTargets;
import fr.combattant54.lotrapi.lovers.ILover;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

@StatisticsEvent(key = "werewolf.charmer_get_effect")
public class CharmerGetEffectDeathEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final IPlayerWW playerWW;

    private final ILover lover;

    private boolean cancel = false;

    public CharmerGetEffectDeathEvent(IPlayerWW playerWW, ILover lover) {
        this.playerWW = playerWW;
        this.lover = lover;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    @StatisticsPlayer
    public IPlayerWW getPlayerWW() {
        return playerWW;
    }

    public ILover getLover() {
        return lover;
    }

    @Override
    public boolean isCancelled() {
        return this.cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    @StatisticsTargets
    public Set<IPlayerWW> getTargets() {
        return new HashSet<>(this.getLover().getLovers());
    }
}