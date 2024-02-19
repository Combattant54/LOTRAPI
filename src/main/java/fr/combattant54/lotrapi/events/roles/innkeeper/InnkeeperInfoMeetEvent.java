package fr.combattant54.lotrapi.events.roles.innkeeper;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInt;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.innkeeper.meet")
public class InnkeeperInfoMeetEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final int number;

    public InnkeeperInfoMeetEvent(IPlayerWW playerWW, IPlayerWW target, int number) {
        super(playerWW, target);
        this.number = number;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }


    @StatisticsExtraInt
    public int getNumber() {
        return number;
    }
}
