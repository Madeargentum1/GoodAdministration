package com.minecraftPlugin;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetGamemodeSpectator implements CommandExecutor {
    private final GoodAdministration goodAdministration;

    public SetGamemodeSpectator(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if (s.equalsIgnoreCase("gm3")){
            if (commandSender instanceof Player){
                if (p.hasPermission("goodadministration.gm3")){
                    p.setGameMode(GameMode.SPECTATOR);
                    return true;
                }
            }
        }
        return false;
    }
}
