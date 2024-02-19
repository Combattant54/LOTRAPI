package fr.combattant54.lotrapi.game;

import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;

import java.util.List;

public interface IWerewolfChatHandler {
    /**
     * Enable Werewolf Chat
     */
    void enableWereWolfChat();

    /**
     * Disable WereWolf chat
     */
    void disableWereWolfChat();

    boolean isWereWolfChatEnable();

    int getMessagesCount(IPlayerWW playerWW);

    List<String> getMessages(IPlayerWW playerWW);

    void addMessage(IPlayerWW playerWW, String message);
}
