package fr.combattant54.lotrapi.enums;

@SuppressWarnings({"unused"})
public enum Camp {
    DARK_SIDE("lotr.categories.dark_side"),
    NEUTRAL("lotr.categories.neutral"),
    RING_COMMUNITY("lotr.categories.ring_community");

    private final String key;

    Camp(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
