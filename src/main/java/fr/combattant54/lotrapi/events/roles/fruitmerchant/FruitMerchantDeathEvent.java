package fr.combattant54.lotrapi.events.roles.fruitmerchant;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInfo;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInt;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;


@StatisticsEvent(key = "werewolf.fruit_merchant_death")
public class FruitMerchantDeathEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final GoldenCount goldenAppleCount;

    public FruitMerchantDeathEvent(IPlayerWW playerWW, IPlayerWW playerWW1, GoldenCount goldenAppleCount) {
        super(playerWW, playerWW1);
        this.goldenAppleCount = goldenAppleCount;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public GoldenCount getGoldenAppleCount() {
        return goldenAppleCount;
    }

    @StatisticsExtraInfo
    public String getExtraInfo() {
        return String.valueOf(getGoldenAppleCount().getOldCount());
    }

    @StatisticsExtraInt
    public int getExtraInt() {
        return getGoldenAppleCount().getNewCount();
    }
}