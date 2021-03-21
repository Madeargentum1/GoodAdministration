package com.minecraftPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Food implements CommandExecutor {
    private final GoodAdministration goodAdministration;

    public Food(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if (s.equalsIgnoreCase("food")){
            if (commandSender instanceof Player){
                if (p.hasPermission("goodadministration.food")){
                    p.setFoodLevel(20);
                    p.sendMessage(ChatColor.GOLD + "Запас еды восстановлен!");
                    return true;
                }
            }
        }
        return false;
    }
}
