package fr.combattant54.lotrapi.events.roles.infect_father_of_the_wolves;

import fr.combattant54.lotrapi.annotations.TellableStoryEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;


@StatisticsEvent(key = "werewolf.infection")
@TellableStoryEvent
public class InfectionEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private boolean informInfectionCancelledMessage = true;


    public InfectionEvent(IPlayerWW playerWW, IPlayerWW targetWW) {
        super(playerWW, targetWW);
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public boolean isInformInfectionCancelledMessage() {
        return this.informInfectionCancelledMessage;
    }

    public void setInformInfectionCancelledMessage(boolean b) {
        this.informInfectionCancelledMessage = b;
    }
}