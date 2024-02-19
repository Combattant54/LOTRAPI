package fr.combattant54.lotrapi.role.interfaces;

import fr.combattant54.lotrapi.player.interfaces.IPlayerWW;
import fr.combattant54.lotrapi.enums.Category;

import java.util.Set;

public interface IGuesser {

    boolean canGuess(IPlayerWW targetWW);

    void resolveGuess(String key, IPlayerWW targetWW);

    Set<Category> getAvailableCategories();
}
