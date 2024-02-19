package fr.combattant54.lotrapi.events.roles.charmer;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInfo;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;


@StatisticsEvent(key = "werewolf.charmed_death_event")
public class CharmedDeathEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final boolean beforeCountDown;

    public CharmedDeathEvent(IPlayerWW playerWW, IPlayerWW charmerWW, boolean beforeCountDown) {
        super(playerWW, charmerWW);
        this.beforeCountDown = beforeCountDown;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public boolean isBeforeCountDown() {
        return this.beforeCountDown;
    }

    @StatisticsExtraInfo
    public String getExtraInfo() {
        return isBeforeCountDown() ? "werewolf.before_count_down" :
                "werewolf.after_count_down";
    }
}