package io.github.ph1lou.werewolfapi.events;

import io.github.ph1lou.werewolfapi.PlayerWW;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class CustomEvent extends Event implements Cancellable {

    private final PlayerWW playerWW;
    private final Set<PlayerWW> playerWWS;

    private final int extraInt;
    private final String extraInfo;
    private boolean cancel=false;
    private final String event;

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public CustomEvent(PlayerWW playerWW, Set<PlayerWW> playerWWS, int extraInt, String extraInfo, String event){
        this.playerWW =playerWW;
        this.playerWWS = playerWWS;
        this.extraInt = extraInt;
        this.extraInfo = extraInfo;
        this.event=event;
    }

    public CustomEvent(PlayerWW playerWW, Set<PlayerWW> playerWWS, int extraInt , String event){
        this(playerWW, playerWWS,extraInt,"",event);
    }
    public CustomEvent(PlayerWW playerWW, Set<PlayerWW> playerWWS, String extraInfo , String event){
        this(playerWW, playerWWS,0,extraInfo,event);
    }

    public CustomEvent(PlayerWW playerWW, Set<PlayerWW> playerWWS, String event){
        this(playerWW, playerWWS,0,"",event);
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public PlayerWW getPlayerWW() {
        return playerWW;
    }

    public Set<PlayerWW> getPlayerWWS() {
        return playerWWS;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancel=b;
    }

    public String getEvent() {
        return event;
    }

    public int getExtraInt() {
        return extraInt;
    }

    public String getExtraInfo() {
        return extraInfo;
    }
}

