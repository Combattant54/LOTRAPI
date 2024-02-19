package fr.combattant54.lotrapi.registers;


import fr.combattant54.lotrapi.commands.ICommand;
import fr.combattant54.lotrapi.commands.ICommandRole;
import fr.combattant54.lotrapi.enums.Category;
import fr.combattant54.lotrapi.lovers.ILover;
import fr.combattant54.lotrapi.role.interfaces.IRole;
import fr.combattant54.lotrapi.utils.Wrapper;
import fr.combattant54.lotrapi.annotations.AdminCommand;
import fr.combattant54.lotrapi.annotations.Configuration;
import fr.combattant54.lotrapi.annotations.Lover;
import fr.combattant54.lotrapi.annotations.ModuleWerewolf;
import fr.combattant54.lotrapi.annotations.PlayerCommand;
import fr.combattant54.lotrapi.annotations.RandomEvent;
import fr.combattant54.lotrapi.annotations.Role;
import fr.combattant54.lotrapi.annotations.RoleCommand;
import fr.combattant54.lotrapi.annotations.Scenario;
import fr.combattant54.lotrapi.annotations.Timer;
import fr.combattant54.lotrapi.annotations.statistics.StatisticsEvent;
import fr.combattant54.lotrapi.listeners.impl.ListenerWerewolf;
import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Optional;
import java.util.Set;

public interface IRegisterManager {

    Optional<String> getModuleKey(String key);

    Set<Wrapper<IRole, Role>> getRolesRegister();

    Set<Wrapper<ILover, Lover>> getLoversRegister();

    Set<Wrapper<ListenerWerewolf, Scenario>> getScenariosRegister();

    Set<Wrapper<?, Configuration>> getConfigsRegister();

    Set<Wrapper<?, Timer>> getTimersRegister();

    Set<Wrapper<ICommand, PlayerCommand>> getPlayerCommandsRegister();

    Set<Wrapper<ICommandRole, RoleCommand>> getRoleCommandsRegister();

    Set<Wrapper<ICommand, AdminCommand>> getAdminCommandsRegister();

    Set<Wrapper<JavaPlugin, ModuleWerewolf>> getModulesRegister();

    Set<Wrapper<ListenerWerewolf, RandomEvent>> getRandomEventsRegister();

    Set<Wrapper<Event, StatisticsEvent>> getEventsClass();

    Optional<JavaPlugin> getAddon(String key);

    Optional<Category> getCategory(String key);
}
