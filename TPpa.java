package com.minecraftPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TPpa implements CommandExecutor {
    private final GoodAdministration goodAdministration;

    public TPpa(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }
    Player p2;
    boolean b = false;
    int k;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player p = (Player) commandSender;
        if (s.equalsIgnoreCase("tppa")){
            if (commandSender instanceof Player){
                if (p.hasPermission("goodadministration.tppa")){
                    if (args.length > 0){
                        if ((!args[0].equalsIgnoreCase("accept")) &&
                                (!args[0].equalsIgnoreCase("decline"))) {
                            try {
                                k += 1;
                                p2 = Bukkit.getPlayer(args[0]);
                                p2.sendMessage(
                                        ChatColor.RED + "К вам хочет телепортироваться игрок " +
                                                p.getName() +
                                                ". Принять тп - /tppa accept, отклонить - /tppa decline."+
                                " Число действующих запросов: " + k);
                                b = true;
                                return true;
                            } catch (Exception e) {
                                p.sendMessage(ChatColor.RED + "Неправильные аргументы! Проверьте, онлайн ли игрок.");
                                return true;
                            }
                        }
                        else if (args[0].equalsIgnoreCase("accept")){
                            if (!b) {
                                p.sendMessage(
                                        ChatColor.RED + "Вам не отправляли запрос на тп!");
                            }
                            else{
                                p.teleport(p2);
                                b = false;
                                if (k > 0) k -= 1;
                            }
                            return true;
                        }
                        else if (args[0].equalsIgnoreCase("decline")){
                            p.sendMessage(ChatColor.RED + "Игрок отклонил запрос на телепортацию.");
                            p2.sendMessage(ChatColor.RED + "Вы отклонили запрос на телепортацию.");
                            b = false;
                            return true;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
