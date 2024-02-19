package fr.combattant54.lotrapi.events.game.life_cycle;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsTarget;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;


@StatisticsEvent(key = "werewolf.final_kill")
public class FinalDeathEvent extends FirstDeathEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public FinalDeathEvent(IPlayerWW playerWW, Set<IPlayerWW> lastStrikers) {
        super(playerWW, lastStrikers);
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    @Nullable
    @StatisticsTarget
    public IPlayerWW getTarget() {
        return getPlayerWW().getLastKiller().isPresent() ?
                getPlayerWW().getLastKiller().get() : null;
    }
}
