package fr.combattant54.lotrapi.enums;

import java.util.Arrays;
import java.util.Optional;

@SuppressWarnings({"unused"})
public enum Category {
    DARK_SIDE("lotr.categories.dark_side", "lotr.categories.colors.dark_side"),
    RING_COMMUNITY("lotr.categories.ring_community", "lotr.categories.colors.ring_community"),
    NEUTRAL("lotr.categories.neutral", "lotr.categories.colors.neutral");

    private final String key;
    private final String chatColor;

    Category(String key, String chatColor) {
        this.key = key;
        this.chatColor = chatColor;
    }

    public static Optional<Category> fromKey(String key) {
        return Arrays.stream(values())
                .filter(category -> category.getKey().equals(key)).findFirst();
    }

    public String getChatColor() {
        return chatColor;
    }

    public String getKey() {
        return key;
    }
}
