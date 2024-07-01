package com.bortoletto.joaog.roastrotten;

import com.bortoletto.joaog.roastrotten.entities.CustomFurnaceRecipe;
import com.bortoletto.joaog.roastrotten.events.FurnaceEvent;
import com.bortoletto.joaog.roastrotten.utils.Message;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.plugin.java.JavaPlugin;

public final class RoastRotten extends JavaPlugin {

    private static RoastRotten instance;

    public static RoastRotten getInstance() {
        return instance;
    }

    @Override
    public void onLoad() {
        Bukkit.getConsoleSender().sendMessage(Message.prefix + " §3Plugin sendo carregado com sucesso!");
    }

    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getConsoleSender().sendMessage(Message.prefix + " §aPlugin habilitado com sucesso!");
    }

    @Override
    public void onDisable() {
        instance = null;
        Bukkit.getConsoleSender().sendMessage(Message.prefix + " §cPlugin desabilitado com sucesso!");
    }
}
