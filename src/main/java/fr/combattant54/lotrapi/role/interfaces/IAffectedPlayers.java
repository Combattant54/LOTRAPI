package fr.combattant54.lotrapi.role.interfaces;

import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;

import java.util.List;

public interface IAffectedPlayers {

    void addAffectedPlayer(IPlayerWW playerWW);

    void removeAffectedPlayer(IPlayerWW playerWW);

    void clearAffectedPlayer();

    List<? extends IPlayerWW> getAffectedPlayers();

}
