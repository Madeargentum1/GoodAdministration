package com.minecraftPlugin;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class CheckGamemode implements Listener {
    private final GoodAdministration goodAdministration;

    public CheckGamemode(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }
    @EventHandler
    public void checkMethod(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action ac = e.getAction();
        if (p.getGameMode() == GameMode.CREATIVE) {
            if ((e.getAction() == Action.RIGHT_CLICK_BLOCK) &&
                    (p.getItemInHand().getType() == Material.DIAMOND_BLOCK) ||
                    (p.getItemInHand().getType() == Material.GOLD_BLOCK) ||
                    (p.getItemInHand().getType() == Material.EMERALD_BLOCK) ||
                    (p.getItemInHand().getType() == Material.NETHERITE_BLOCK) ||
                    (p.getItemInHand().getType() == Material.NETHERITE_BOOTS) ||
                    (p.getItemInHand().getType() == Material.NETHERITE_HELMET) ||
                    (p.getItemInHand().getType() == Material.NETHERITE_CHESTPLATE) ||
                    (p.getItemInHand().getType() == Material.NETHERITE_LEGGINGS) ||
                    (p.getItemInHand().getType() == Material.DIAMOND_BOOTS) ||
                    (p.getItemInHand().getType() == Material.DIAMOND_CHESTPLATE) ||
                    (p.getItemInHand().getType() == Material.DIAMOND_LEGGINGS) ||
                    (p.getItemInHand().getType() == Material.DIAMOND_HELMET) ||
                    (p.getItemInHand().getType() == Material.NETHERITE_SWORD) ||
                    (p.getItemInHand().getType() == Material.NETHERITE_AXE) ||
                    (p.getItemInHand().getType() == Material.NETHERITE_INGOT) ||
                    (p.getItemInHand().getType() == Material.NETHERITE_SCRAP) ||
                    (p.getItemInHand().getType() == Material.NETHERITE_PICKAXE) ||
                    (p.getItemInHand().getType() == Material.DIAMOND_ORE) ||
                    (p.getItemInHand().getType() == Material.ANCIENT_DEBRIS)) {
                Block b = e.getClickedBlock();

            }
        }
    }
}
