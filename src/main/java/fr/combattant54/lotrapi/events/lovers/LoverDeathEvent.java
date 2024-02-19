package fr.combattant54.lotrapi.events.lovers;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsTargets;
import fr.combattant54.lotrapi.lovers.ILover;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;


@StatisticsEvent(key = "werewolf.lover_death")
public class LoverDeathEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final ILover lover;

    public LoverDeathEvent(ILover lover) {
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

    public ILover getLover() {
        return this.lover;
    }

    @StatisticsTargets
    public Set<IPlayerWW> getTargets() {
        return new HashSet<>(this.lover.getLovers());
    }
}
