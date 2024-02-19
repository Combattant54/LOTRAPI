package fr.combattant54.lotrapi.events.werewolf;

import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AppearInWereWolfListEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean appear = false;

    public AppearInWereWolfListEvent(IPlayerWW playerWW, IPlayerWW target) {
        super(playerWW, target);
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public boolean isAppear() {
        return appear;
    }

    public void setAppear(boolean appear) {
        this.appear = appear;
    }
}