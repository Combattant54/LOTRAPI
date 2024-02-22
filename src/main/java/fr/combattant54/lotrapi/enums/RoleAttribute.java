package fr.combattant54.lotrapi.enums;

@SuppressWarnings({"unused"})
public enum RoleAttribute {
    RING_COMMUNITY("lotr.attributes.viring_communityllager"),
    MINOR_INFORMATION("lotr.attributes.minor_information"),
    INFORMATION("lotr.attributes.information"),
    DARK_SIDE("lotr.attributes.dark_side"),
    HYBRID("lotr.attributes.hybrid"),
    NEUTRAL("lotr.attributes.neutral");

    private final String key;

    RoleAttribute(String key){
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }
}
