package fr.combattant54.lotrapi.events.roles.will_o_the_wisp;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInfo;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.will_o_the_wisp_recover_role")
public class WillOTheWispRecoverRoleEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private String key;

    public WillOTheWispRecoverRoleEvent(IPlayerWW playerWW, IPlayerWW targetWW, String key) {
        super(playerWW, targetWW);
        this.key = key;
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
    public String getRoleKey() {
        return key;
    }

    public void setRoleKey(String key) {
        this.key = key;
    }

}

