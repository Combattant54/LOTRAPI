package fr.combattant54.lotrapi.events;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsExtraInfo;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.troll")
public class TrollEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final String key;

    public TrollEvent(String key) {
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
    public String getTrollKey() {
        return this.key;
    }

}