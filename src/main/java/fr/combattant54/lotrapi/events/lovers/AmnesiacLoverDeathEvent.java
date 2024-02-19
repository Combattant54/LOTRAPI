package fr.combattant54.lotrapi.events.lovers;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsPlayer;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsTarget;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;


@StatisticsEvent(key = "werewolf.amnesiac_lover_death")
public class AmnesiacLoverDeathEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final IPlayerWW playerWW1;
    private final IPlayerWW playerWW2;

    public AmnesiacLoverDeathEvent(@NotNull IPlayerWW playerWW1, @NotNull IPlayerWW playerWW2) {
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

    @StatisticsPlayer
    public IPlayerWW getPlayerWW1() {
        return playerWW1;
    }

    @StatisticsTarget
    public IPlayerWW getPlayerWW2() {
        return playerWW2;
    }

}
