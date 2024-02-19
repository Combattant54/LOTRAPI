package fr.combattant54.lotrapi.role.interfaces;

import fr.combattant54.lotrapi.player.interfaces.IAuraModifier;
import fr.combattant54.lotrapi.enums.Aura;

import java.util.List;

/**
 * Aura methods for oracle
 */
public interface IAura {

    Aura getAura();

    Aura getDefaultAura();

    void addAuraModifier(IAuraModifier auraModifier);

    void removeAuraModifier(IAuraModifier auraModifier);

    void removeAuraModifier(String modifierName);

    void removeTemporaryAuras();

    List<IAuraModifier> getAuraModifiers();
}
