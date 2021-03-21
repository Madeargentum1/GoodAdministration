package com.minecraftPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VanishEffect implements CommandExecutor {

    private final GoodAdministration goodAdministration;

    public VanishEffect(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }

    @Override
    public boolean onCommand(CommandSender commandSender,
                             Command command,
                             String s,
                             String[] strings) {

        Player p = (Player) commandSender;
       if (s.equalsIgnoreCase("vanishg")) {
           if (commandSender instanceof Player){
               if (p.hasPermission("*")){
                   if (strings.length>0) {
                       if (strings[0].equals("off")){
                           p.setCustomNameVisible(true);
                           p.setInvisible(false);
                           return true;
                       }

                       if (strings[0].equals("on")){
                           p.setCustomNameVisible(false);
                           p.setInvisible(true);
                           return true;
                       }
                       else{
                           p.sendMessage("что-то пошло не так...");
                           return false;
                       }
                   }
                   else{
                       p.sendMessage("слишком мало аргументов!");
                       return false;
                   }
               }
               return true;
           }
           return true;
       }

        return false;
    }
}
