package com.wotch.test;

import java.util.Arrays;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import net.md_5.bungee.api.ChatColor;

public class MenuCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
	
		if (commandSender instanceof Player) {
			Player player = (Player) commandSender;
			
			Inventory inv = Bukkit.createInventory(player, 45, "Help Menu");
			
			
			// Heal Command 
			ItemStack heal = new ItemStack(Material.ANVIL);
			ItemMeta healMeta = heal.getItemMeta();
			healMeta.setDisplayName(ChatColor.RED + "Heal");
			heal.setItemMeta(healMeta);
			healMeta.setLore(Arrays.asList(ChatColor.GRAY + "Heals you to full health!"));
			inv.setItem(20, heal);
			
			
			
			
			// Menu Command
			ItemStack menu = new ItemStack(Material.MAP);
			ItemMeta menuMeta = menu.getItemMeta();
			menuMeta.setDisplayName(ChatColor.YELLOW + "Menu");
			menu.setItemMeta(menuMeta);
			menuMeta.setLore(Arrays.asList(ChatColor.GRAY + "Shows all working commands!"));
			inv.setItem(22, menu);
			
			// Frame for GUI
			ItemStack frame = new ItemStack(Material.STAINED_GLASS_PANE);
			for(int i : new int[] {1,2,3,4,5,6,7,8,9,17,18,26,27,35,36,44,45,46,47,48,49,50,51,52,53}) {
				inv.setItem(i, frame);
			}
			// Close Button
			ItemStack close = new ItemStack(Material.BARRIER);
			ItemMeta closeMeta = close.getItemMeta();
			closeMeta.setDisplayName(ChatColor.RED + "Close");
			close.setItemMeta(closeMeta);
			inv.setItem(0, close);
			
			
			
			
			
			
			player.openInventory(inv);
		}
		
		return false;
	}

}
