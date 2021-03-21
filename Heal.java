package com.minecraftPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
    private final GoodAdministration goodAdministration;

    public Heal(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if (s.equalsIgnoreCase("heal")){
            if (commandSender instanceof Player){
                if (p.hasPermission("goodadministration.heal")){
                    p.setHealth(20);
                    p.sendMessage(ChatColor.GOLD + "Здоровье восстановлено!");
                    return true;
                }
            }
        }
        return false;
    }
}
