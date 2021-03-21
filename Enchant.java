package com.minecraftPlugin;

import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class Enchant implements Listener {

    private final GoodAdministration goodAdministration;
    private Inventory inv;
    private Material m;
    private Material book;

    public Enchant(GoodAdministration goodAdministration) {
        this.goodAdministration = goodAdministration;
    }
    @EventHandler
    public void addEnchant(InventoryClickEvent e){
        m = e.getCurrentItem().getType();
        book = Material.ENCHANTED_BOOK;
        HumanEntity p = e.getWhoClicked();
        p = (Player) p;
        p.sendMessage("Вы перетащили " + m);
    }
}
