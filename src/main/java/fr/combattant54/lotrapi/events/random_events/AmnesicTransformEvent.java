package fr.combattant54.lotrapi.events.random_events;

import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.events.roles.SelectionEvent;
import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;

@StatisticsEvent(key = "werewolf.amnesic_transform")
public class AmnesicTransformEvent extends SelectionEvent {

    public AmnesicTransformEvent(IPlayerWW playerWW, IPlayerWW targetWW) {
        super(playerWW, targetWW);
    }
}
