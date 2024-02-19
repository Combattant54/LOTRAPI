package fr.combattant54.lotrapi.player.interfaces;

import fr.combattant54.lotrapi.enums.Aura;

public interface IAuraModifier extends Comparable<IAuraModifier> {

    Aura getAura();

    /**
     * Highest priority prevails. Behaviour for identical priorities is undefined
     *
     * @return The priority of the modifier.
     */
    int getPriority();

    /**
     * @return The name of the modifier. Only the most recent modifier with a given name is considered
     */
    String getName();

    boolean isTemporary();
}
