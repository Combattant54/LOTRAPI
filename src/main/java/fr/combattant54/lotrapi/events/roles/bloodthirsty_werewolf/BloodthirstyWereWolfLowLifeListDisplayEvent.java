package fr.combattant54.lotrapi.events.roles.bloodthirsty_werewolf;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsPlayer;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsTargets;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

@StatisticsEvent(key = "werewolf.bloodthirsty_werewolf_low_life_list_display")
public class BloodthirstyWereWolfLowLifeListDisplayEvent extends Event {
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList(){
        return HANDLERS_LIST;
    }

    private final IPlayerWW playerWW;
    private final Set<IPlayerWW> playersWW;

    public BloodthirstyWereWolfLowLifeListDisplayEvent(IPlayerWW playerWW, Set<IPlayerWW> playersWW){
        this.playerWW = playerWW;
        this.playersWW = playersWW;
    }

    @StatisticsPlayer
    public IPlayerWW getPlayerWW(){
        return this.playerWW;
    }

    @StatisticsTargets
    public Set<IPlayerWW> getPlayersWWSet(){
        return this.playersWW;
    }
}
