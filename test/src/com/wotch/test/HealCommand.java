package com.wotch.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args) {
		
		Player player = (Player) sender;
		
		player.setHealth(20.0);
		player.sendMessage("Healed!");
		return false;
	}
}
