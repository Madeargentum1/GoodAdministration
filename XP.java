package com.minecraftPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class XP implements CommandExecutor {
    private final GoodAdministration goodAdministration;

    public XP(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if (s.equalsIgnoreCase("xp")){
            if (commandSender instanceof Player){
                if (p.hasPermission("goodadministration.xp")){
                    p.giveExpLevels(5);
                    return true;
                }
            }
        }
        return false;
    }
}
