package fr.combattant54.lotrapi.game;

import com.eclipsesource.json.JsonValue;
import fr.combattant54.lotrapi.player.utils.Formatter;

import java.util.List;
import java.util.Map;

public interface ILanguageManager {

    List<String> getTranslationList(String key, Formatter... formatters);

    String getTranslation(String key, Formatter... formatters);

    void loadTranslations(String addonKey, Map<String, JsonValue> translations);
}
