package fr.combattant54.lotrapi.events.lovers;

import fr.combattant54.lotrapi.events.game.life_cycle.AnnouncementDeathEvent;
import fr.combattant54.lotrapi.lovers.ILover;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;

public class AnnouncementLoverDeathEvent extends AnnouncementDeathEvent {


    /**
     * // @param playerWW     the player dead
     * // @param targetPlayer the player who will show the message
     * // @param format       the message
     */
    private ILover lover;

    public AnnouncementLoverDeathEvent(ILover lover, IPlayerWW playerWW, IPlayerWW targetPlayer, String format) {
        super(playerWW, targetPlayer, format);
        this.lover = lover;
    }

    public ILover getLover() {
        return lover;
    }
}
