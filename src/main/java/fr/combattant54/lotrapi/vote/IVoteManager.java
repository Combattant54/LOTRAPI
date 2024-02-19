package fr.combattant54.lotrapi.vote;

import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import fr.combattant54.lotrapi.enums.VoteStatus;

import java.util.Optional;
import java.util.Set;

public interface IVoteManager {

    /**
     * Add a vote to voteWW by voterWW
     *
     * @param voterWW the voter
     * @param voteWW  the player who received vote
     */
    void setOneVote(IPlayerWW voterWW, IPlayerWW voteWW);

    /**
     * Reset Vote
     */
    void resetVote();

    /**
     * Get Players Vote
     *
     * @return vote count for each player (in new vote system return only villager vote)
     */
    int getVotes(IPlayerWW playerWW);

    void setVotes(IPlayerWW playerWW, int value);

    /**
     * Get Players Vote
     *
     * @return vote for each player
     */
    Optional<IPlayerWW> getPlayerVote(IPlayerWW playerWW);

    void setPlayerVote(IPlayerWW voterWW, IPlayerWW playerWW);

    /**
     * Get Player who have the largest amount of vote
     *
     * @return PlayerWW (if new vote return player most voted by villager)
     */
    Optional<IPlayerWW> getResult();


    Set<? extends IPlayerWW> getAlreadyVotedPlayers();

    Set<? extends IPlayerWW> getVotedPlayers();

    Set<? extends IPlayerWW> getVoters();

    /**
     * Check Vote Status
     */
    boolean isStatus(VoteStatus status);

    /**
     * Set Vote Status
     */
    void setStatus(VoteStatus status);

}
