package com.minecraftPlugin;

import net.minecraft.server.v1_16_R3.CommandListenerWrapper;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetCords implements CommandExecutor {
    private final GoodAdministration goodAdministration;

    public GetCords(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if (s.equalsIgnoreCase("cords")) {
            if (commandSender instanceof Player) {
                p.sendMessage(ChatColor.GOLD + "Ваши координаты: " +
                p.getLocation());
                return true;
                }
            }
        return false;
    }
}
