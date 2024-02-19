package fr.combattant54.lotrapi.events.roles.thug;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInt;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.thug_recover_golden_apple")
public class ThugRecoverGoldenAppleEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private int goldenApple;

    public ThugRecoverGoldenAppleEvent(IPlayerWW playerWW, IPlayerWW targetWW, int goldenApple) {
        super(playerWW, targetWW);
        this.goldenApple = goldenApple;
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
    public int getGoldenApple() {
        return goldenApple;
    }

    public void setGoldenApple(int goldenApple) {
        this.goldenApple = goldenApple;
    }
}