package me.javawick.util;

import org.bukkit.plugin.java.JavaPlugin;

import me.javawick.util.chat.Color;
import me.javawick.util.commands.Version;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new Version(this);
		getServer().getConsoleSender().sendMessage(Color.chat("&bJavaWick Utilities enabled"));
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(Color.chat("&bJavaWick Utilities disabled"));
	}
}
