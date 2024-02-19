package fr.combattant54.lotrapi.role.interfaces;

public interface IDisplay {

    boolean isDisplayCamp(String camp);

    String getDisplayCamp();

    void setDisplayCamp(String camp);

    String getDisplayRole();

    void setDisplayRole(String key);

    void clearDisplay();
}
