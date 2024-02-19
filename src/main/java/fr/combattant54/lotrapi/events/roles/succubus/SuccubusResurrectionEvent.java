package fr.combattant54.lotrapi.events.roles.succubus;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsTarget;
import fr.combattant54.lotrapi.events.game.life_cycle.ResurrectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.succubus_resurrection")
public class SuccubusResurrectionEvent extends ResurrectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final IPlayerWW targetWW;

    public SuccubusResurrectionEvent(IPlayerWW playerWW, IPlayerWW targetWW) {
        super(playerWW);
        this.targetWW = targetWW;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    @StatisticsTarget
    public IPlayerWW getTargetWW() {
        return targetWW;
    }
}