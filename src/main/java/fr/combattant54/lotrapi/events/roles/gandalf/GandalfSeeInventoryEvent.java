package fr.combattant54.lotrapi.events.roles.gandalf;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

//@StatisticsEvent(key = "lotr.gandalf_inventory_see")
public class GandalfSeeInventoryEvent extends SelectionEvent {
    public static final HandlerList HANDLERS_LIST = new HandlerList();
    private Inventory inventory;

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public GandalfSeeInventoryEvent(IPlayerWW playerWW, IPlayerWW targetPlayerWW, Inventory inv){
        super(playerWW, targetPlayerWW);
        this.inventory = inv;
    }

    public Inventory getInventory(){
        return this.inventory;
    }

    public void setInventory(Inventory inv){
        this.inventory = inv;
    }
}
