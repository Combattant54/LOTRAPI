package fr.combattant54.lotrapi.events.roles.fox;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInfo;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;


@StatisticsEvent(key = "werewolf.sniff")
public class SniffEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isWereWolf;

    public SniffEvent(IPlayerWW playerWW, IPlayerWW targetWW, boolean isWereWolf) {
        super(playerWW, targetWW);
        this.isWereWolf = isWereWolf;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public boolean isWereWolf() {
        return isWereWolf;
    }

    public void setWereWolf(boolean wereWolf) {
        isWereWolf = wereWolf;
    }

    @StatisticsExtraInfo
    public String getExtraInfo() {
        return isWereWolf() ? "werewolf.roles.fox.werewolf" : "werewolf.roles.fox.not_werewolf";
    }
}