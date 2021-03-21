package com.minecraftPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Clear implements CommandExecutor {
    private final GoodAdministration goodAdministration;

    public Clear(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if (s.equalsIgnoreCase("cls")){
            if (commandSender instanceof Player){
                if (p.hasPermission("goodadministration.cls")){
                    p.getInventory().clear();
                    return true;
                }
            }
        }
        return false;
    }
}
