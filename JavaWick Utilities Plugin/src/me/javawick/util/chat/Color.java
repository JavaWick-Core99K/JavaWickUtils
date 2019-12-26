package me.javawick.util.chat;

import org.bukkit.ChatColor;

public class Color {

	/**
	 * Make your texts colorful
	 * 
	 * @param s - the string to color
	 * @return String - the colored string
	 */
	public static String chat(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}
}
