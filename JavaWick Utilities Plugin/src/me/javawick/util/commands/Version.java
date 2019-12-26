package me.javawick.util.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.javawick.util.Main;
import me.javawick.util.chat.Color;

public class Version implements CommandExecutor {

	private Main plugin;
	
	public Version(Main pl) {
		plugin = pl;
		plugin.getCommand("jwu-version").setExecutor(this);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(args.length != 0)
			return false;
		
		String s = Color.chat("&bJavaWickUtils version &e") + plugin.getDescription().getVersion();
		sender.sendMessage(s);
		
		return true;
	}

}
