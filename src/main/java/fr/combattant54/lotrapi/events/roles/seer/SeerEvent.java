package fr.combattant54.lotrapi.events.roles.seer;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInfo;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.see")
public class SeerEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private String camp;

    public SeerEvent(IPlayerWW playerWW, IPlayerWW targetWW, String camp) {
        super(playerWW, targetWW);
        this.camp = camp;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    @StatisticsExtraInfo
    public String getCamp() {
        return camp;
    }

    public void setCamp(String camp) {
        this.camp = camp;
    }

}

