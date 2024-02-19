package fr.combattant54.lotrapi.events.roles.analyst;

import fr.combattant54.lotrapi.annotations.TellableStoryEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInfo;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.stream.Collectors;


@StatisticsEvent(key = "werewolf.analyst_analyst")
@TellableStoryEvent
public class AnalystExtraDetailsEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final Set<PotionEffectType> potions;

    public AnalystExtraDetailsEvent(IPlayerWW playerWW, IPlayerWW targetUUID, Set<PotionEffectType> potions) {
        super(playerWW, targetUUID);
        this.potions = potions;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public Set<PotionEffectType> getPotions() {
        return this.potions;
    }

    @StatisticsExtraInfo
    public String getExtraInfo() {
        return getPotions()
                .stream()
                .map(PotionEffectType::getName)
                .collect(Collectors.joining(", "));
    }

}

