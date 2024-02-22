package fr.combattant54.lotrapi.events.roles.gimli;

import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class GimliTargetAxe extends SelectionEvent {
    public static final HandlerList HANDLERS_LIST = new HandlerList();

    public GimliTargetAxe(IPlayerWW playerWW, IPlayerWW targetWW) {
        super(playerWW, targetWW);
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS_LIST;
    }
}
