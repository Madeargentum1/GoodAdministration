package com.minecraftPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class LightMessage implements CommandExecutor {
    private final GoodAdministration goodAdministration;

    public LightMessage(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }
    private String i = "";
    private int k = 0;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player p = (Player) sender;
        ArrayList<Player> arr = new ArrayList<>();
        for (Player p2 : Bukkit.getOnlinePlayers()) arr.add(p2);
        if (s.equalsIgnoreCase("lmessage")){
            if (sender instanceof Player) {
                if (p.hasPermission("goodadministration.lmesssage")) {
                    if (strings.length > 0) {
                        loop:
                        while (true) {
                            i += strings[k];
                            k += 1;
                            if (k >= strings.length) break loop;
                        }
                        for (Player p3 : arr) {
                            p3.sendMessage(ChatColor.RED +
                                    "[" + p.getName() + "]" +
                                    ChatColor.DARK_AQUA + ChatColor.BOLD +
                                    " " + i
                            );
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
