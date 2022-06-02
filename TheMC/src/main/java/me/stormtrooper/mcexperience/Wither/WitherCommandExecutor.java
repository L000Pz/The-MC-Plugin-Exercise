package me.stormtrooper.mcexperience.Wither;

import me.stormtrooper.mcexperience.MCExperience;
import me.stormtrooper.mcexperience.Wither.RunWitherSpawner;
import org.bukkit.plugin.Plugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WitherCommandExecutor implements CommandExecutor {
    private Plugin plugin = MCExperience.getPlugin(MCExperience.class);
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 2){
            long initialDelay = Long.parseLong(args[0]);
            long spawnDelay = Long.parseLong(args[1]);

            new RunWitherSpawner(plugin).runTaskTimer(plugin,initialDelay,spawnDelay);
            return true;
        }else return false;

    }
}
