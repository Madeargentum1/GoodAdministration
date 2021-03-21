package com.minecraftPlugin;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SetGamemodeCreative implements CommandExecutor {
    private final GoodAdministration goodAdministration;

    public SetGamemodeCreative(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player p = (Player) commandSender;
        Inventory inv = p.getInventory();
        if (s.equalsIgnoreCase("gm1")){
            if (commandSender instanceof Player){
                if (p.hasPermission("goodadministration")){
                    p.setGameMode(GameMode.CREATIVE);
                    inv.clear();
                    return true;
                }
            }
        }
        return false;
    }
}
