package me.javawick.util.config;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import me.javawick.util.chat.Color;

public class ConfigFile {

	private File file;
	private FileConfiguration config;
	private Plugin plugin;
	
	public ConfigFile(Plugin pl) {
		plugin = pl;
	}
	
	/**
	 * Setup the custom config file
	 * 
	 * @param plugin   - the name of the plugin
	 * @param fileName - the name of the config file, must end in .yml
	 */
	public void setup(String plugin, String fileName) {
		
		if(!this.plugin.getDataFolder().exists()) {
			this.plugin.getDataFolder().mkdir();
		}
		
		file = new File(Bukkit.getServer().getPluginManager().getPlugin(plugin).getDataFolder(), fileName);
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch(IOException e) {
				// leave blank
			}
		}
		config = YamlConfiguration.loadConfiguration(file);
	}
	
	/**
	 * Gets the config file
	 * 
	 * @return - the config file to edit
	 */
	public FileConfiguration getConfig() {
		return config;
	}
	
	/**
	 * Saves the config file
	 * 
	 * @param pl - the plugin to use
	 */
	public void save(Plugin pl) {
		try {
			config.save(file);
		} catch(IOException e) {
			String name = "&e[" + pl.getName() + "] ";
			pl.getServer().getConsoleSender().sendMessage(Color.chat(name + "&cFailed to save config"));
		}
	}
	
	/**
	 * Reloads the config file
	 * 
	 * @param pl - the plugin to use
	 */
	public void reload(Plugin pl) {
		config = YamlConfiguration.loadConfiguration(file);
	}
}
