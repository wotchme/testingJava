
package com.wotch.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;


public class mainT extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		System.out.println("TEST PLUGIN ENABLED");
		
		
		
		
		// Commands
		getCommand("heal").setExecutor(new HealCommand());
		getCommand("number").setExecutor(new NumberCommand());
		getCommand("menu").setExecutor(new MenuCommand());
		
		//Config Lesson
		
		//this.getConfig().options().copyDefaults();
		//saveDefaultConfig();
		
		//Makes it so bukkit checks for EventHandler's and stuff
		Bukkit.getPluginManager().registerEvents(this, this);
		
		//Spawn Entity
		//Entity ent = Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 0, 0, 0), EntityType.ZOMBIE);
		
		//Get Entity Location
		//ent.getLocation().get
		
		//Set target for zombie
		// Zombie zombie = (Zombie) ent;
		//zombie.settar
		
		
	}
	
	public void editConfig() {
		
		this.getConfig().set("Word", "Apple");
	}
	
	
	
	
	
//	@EventHandler
//	public void onMove(PlayerMoveEvent e) {
		
//		Player player = e.getPlayer();
		
//		if(!player.hasPermission("testplugin.allowmove")) {
//			e.setCancelled(true);;
///		}
//	}
	
	@EventHandler
	public void onThrow(PlayerEggThrowEvent e) {
		
		Player player = e.getPlayer();
		
		player.sendMessage(ChatColor.RED + "Egg thrown!");
	}
	
	@Override
	public void onDisable() {
		System.out.println("TEST PLUGIN DISABLED");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		
			//
				
				
		if(cmd.getName().equals("config")) {
			String word = this.getConfig().getString("Word");
			int number = this.getConfig().getInt("Number");
			
			player.sendMessage(ChatColor.GRAY + "The word is " + ChatColor.GREEN + word + ChatColor.GRAY + " and the number is " + ChatColor.GREEN + number);
		}
		
		return false;
		
		
		
	}
}
