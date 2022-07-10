package fr.ph1lou.werewolfapi.lovers;

import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Listener;

import org.bukkit.event.Listener;

import java.util.List;

public interface ILover extends Listener {

    /**
     * Get Lover Members
     * @return List of lover's member
     */
    List<? extends IPlayerWW> getLovers();

    /**
     * Check if the lover type key match with parameter
     * @param key string key
     * @return if keys match
     */
    boolean isKey(String key);

    /**
     * Get the lover type key
     * @return the string key
     */
    String getKey();

    /**
     * @return if this lover is alive
     */
    boolean isAlive();

    /**
     * When a player is swap in the lover
     * @param oldIPlayerWW the player removed
     * @param newIPlayerWW the player added
     * @return true if the swap succeed
     */
    boolean swap(IPlayerWW oldIPlayerWW, IPlayerWW newIPlayerWW);

    /**
     * method call each second
     */
    void second();
}
