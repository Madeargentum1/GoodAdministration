package com.minecraftPlugin;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetDay implements CommandExecutor {
    private final GoodAdministration goodAdministration;

    public SetDay(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;
        if (s.equalsIgnoreCase("day")){
            if (sender instanceof Player) {
                if (p.hasPermission("goodadministration.day")){
                    World w = p.getWorld();
                    w.setTime(6000L);
                    return true;
                }
            }
        }
        return false;
    }
}
