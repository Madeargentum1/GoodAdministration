package com.minecraftPlugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class GoodAdministration extends JavaPlugin {
    public void onEnable(){

        getLogger().info("m Enabled!");
        getCommand("day").setExecutor(new SetDay(this));
        getCommand("night").setExecutor( new SetNight(this));
        getCommand("vanishg").setExecutor(new VanishEffect(this));
        // getCommand("cords").setExecutor( new GetCords(this));
        getCommand("lmessage").setExecutor(new LightMessage(this));
        getCommand("tppa").setExecutor(new TPpa(this));
        getCommand("tpp").setExecutor(new TP(this));
        getCommand("gm1").setExecutor(new SetGamemodeCreative(this));
        getCommand("gm0").setExecutor(new SetGamemodeSurv(this));
        getCommand("gm3").setExecutor(new SetGamemodeSpectator(this));
        getCommand("heal").setExecutor(new Heal(this));
        getCommand("food").setExecutor(new Food(this));
        getCommand("xp").setExecutor(new XP(this));
        getCommand("cls").setExecutor(new Clear(this));

        Bukkit.getPluginManager().registerEvents(new Enchant(this), this);

        //Bukkit.getPluginManager().registerEvents(new CheckGamemode(this), this);
    }
    public void onDisable(){
        getLogger().info("I'm disabled!");
    }
}
