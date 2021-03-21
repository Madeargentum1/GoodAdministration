package com.minecraftPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TP implements CommandExecutor {
    private final GoodAdministration goodAdministration;

    public TP(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }
    Player p2;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if (s.equalsIgnoreCase("tpp")){
            if (commandSender instanceof Player){
                if (p.hasPermission("goodadministration.tpp")) {
                    if (strings.length > 0) {
                        try {
                            p2 = Bukkit.getPlayer(strings[0]);
                            p.teleport(p2);
                            return true;
                        } catch (Exception e) {
                            p.sendMessage(ChatColor.RED + "Неправильные аргументы! Проверьте, онлайн ли игрок.");
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
