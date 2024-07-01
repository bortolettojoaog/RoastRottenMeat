package com.bortoletto.joaog.roastrotten.events;

import com.bortoletto.joaog.roastrotten.RoastRotten;
import com.bortoletto.joaog.roastrotten.utils.Message;
import org.bukkit.Material;
import org.bukkit.block.Furnace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.FurnaceInventory;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class FurnaceEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = (Player) event.getPlayer();

        event.setJoinMessage("§aO jogador §4" + player.getName() + "§a entrou no servidor!");

        if (player.isOp()) {
            player.sendMessage(Message.prefix + "§2Você está utilizando o plugin na versão: §a" + RoastRotten.getInstance().getDescription().getVersion());
        }
    }

    @EventHandler
    public void onLeft(PlayerQuitEvent event) {
        Player player = (Player) event.getPlayer();

        event.setQuitMessage("§cO jogador §4" + player.getName() + "§c saiu do servidor!");
    }
}
