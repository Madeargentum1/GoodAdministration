package com.minecraftPlugin;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SetGamemodeSurv implements CommandExecutor {
    private final GoodAdministration goodAdministration;

    public SetGamemodeSurv(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;

    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        Inventory inv = p.getInventory();
        if (s.equalsIgnoreCase("gm0")){
            if (commandSender instanceof Player){
                if (p.hasPermission("goodadministration.gm0")){
                    p.setGameMode(GameMode.SURVIVAL);
                    inv.clear();
                    return true;
                }
            }
        }
        return false;
    }
}
