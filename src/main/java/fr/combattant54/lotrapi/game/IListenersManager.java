package fr.combattant54.lotrapi.game;

import fr.combattant54.lotrapi.listeners.impl.ListenerWerewolf;

import java.util.Optional;

public interface IListenersManager {

    Optional<ListenerWerewolf> getRandomEvent(String key);

    Optional<ListenerWerewolf> getScenario(String key);

    Optional<ListenerWerewolf> getConfiguration(String key);

    Optional<ListenerWerewolf> getTimer(String key);

    void updateListeners();
}
