package me.stormtrooper.mcexperience;

import me.stormtrooper.mcexperience.Tower.TowerSpawner;
import me.stormtrooper.mcexperience.Wither.WitherCommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class MCExperience extends JavaPlugin {

    @Override
    public void onEnable() {

        saveDefaultConfig();
        System.out.println("Started!");
        getServer().getPluginManager().registerEvents(new PlayerMovementListener(),this);
        getServer().getPluginCommand("mark-location").setExecutor(new TowerSpawner());
        getServer().getPluginCommand("unlimited-wither-spawner").setExecutor(new WitherCommandExecutor());
    }

}
