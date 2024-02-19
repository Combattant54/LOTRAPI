package fr.combattant54.lotrapi.events.elections;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInfo;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInt;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsPlayer;
import fr.combattant54.lotrapi.enums.MayorState;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.elections.mayor_selection")
public class MayorSelectionEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final MayorState state;
    private final IPlayerWW playerWW;
    private final int numberVotes;

    public MayorSelectionEvent(IPlayerWW playerWW, MayorState state, int numberVotes) {
        this.playerWW = playerWW;
        this.state = state;
        this.numberVotes = numberVotes;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    @StatisticsPlayer
    public IPlayerWW getPlayerWW() {
        return playerWW;
    }

    public MayorState getState() {
        return state;
    }

    @StatisticsExtraInt
    public int getNumberVotes() {
        return this.numberVotes;
    }

    @StatisticsExtraInfo
    public String getExtraInfo() {
        return state.getKey();
    }
}
