package fr.combattant54.lotrapi.events.roles.angel;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInfo;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsPlayer;
import fr.combattant54.lotrapi.enums.AngelForm;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.angel_choice")
public class AngelChoiceEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final IPlayerWW playerWW;
    private final AngelForm choice;

    public AngelChoiceEvent(IPlayerWW playerWW, AngelForm choice) {
        this.playerWW = playerWW;
        this.choice = choice;
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
        return this.playerWW;
    }

    public AngelForm getChoice() {
        return choice;
    }

    @StatisticsExtraInfo
    public String getExtraInfo() {
        return choice.toString();
    }
}

