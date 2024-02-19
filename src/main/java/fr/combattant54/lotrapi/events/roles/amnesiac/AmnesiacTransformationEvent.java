package fr.combattant54.lotrapi.events.roles.amnesiac;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsTarget;
import fr.combattant54.lotrapi.events.roles.TransformationEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.amnesiac_transformation")
public class AmnesiacTransformationEvent extends TransformationEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final IPlayerWW villager;

    public AmnesiacTransformationEvent(@NotNull IPlayerWW playerWW, @NotNull IPlayerWW villager) {
        super(playerWW);
        this.villager = villager;
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
    public IPlayerWW getVillager() {
        return villager;
    }

}