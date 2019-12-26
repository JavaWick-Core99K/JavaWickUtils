package me.javawick.util.item;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.javawick.util.chat.Color;

public class Stack {

	/**
	 * Creates an item
	 * 
	 * @param type - the type of material
	 * @param amount - the amount there is
	 * @return ItemStack - the item
	 */
	public static ItemStack createDefaultItem(Material type, int amount) {
		ItemStack i = new ItemStack(type, amount);
		return i;
	}
	
	/**
	 * Creates an item with custom name
	 * 
	 * @param type - the type of material
	 * @param amount - the amount there is
	 * @param name - the name to display
	 * @return ItemStack - the item
	 */
	public static ItemStack createItemName(Material type, int amount, String name) {
		ItemStack i = new ItemStack(type, amount);
		ItemMeta m = i.getItemMeta();
		
		m.setDisplayName(Color.chat(name));
		i.setItemMeta(m);
		
		return i;
	}
	
	/**
	 * Creates an item with custom lore
	 * 
	 * @param type - the type of material
	 * @param amount - the amount there is
	 * @param lore - the lore to display
	 * @return ItemStack - the item
	 */
	public static ItemStack createItemLore(Material type, int amount, String...lore) {
		ItemStack i = new ItemStack(type, amount);
		ItemMeta m = i.getItemMeta();
		List<String> l = new ArrayList<String>();
		
		for(String s : lore) {
			l.add(Color.chat(s));
		}
		m.setLore(l);
		i.setItemMeta(m);
		
		return i;
	}
	
	/**
	 * Creates an item with custom name and lore
	 * 
	 * @param type - the type of material
	 * @param amount - the amount there is
	 * @param name - the name to display
	 * @param lore - the lore to display
	 * @return ItemStack - the item
	 */
	public static ItemStack createItem(Material type, int amount, String name ,String...lore) {
		ItemStack i = new ItemStack(type, amount);
		ItemMeta m = i.getItemMeta();
		List<String> l = new ArrayList<String>();
		
		for(String s : lore) {
			l.add(Color.chat(s));
		}
		m.setLore(l);
		m.setDisplayName(Color.chat(name));
		i.setItemMeta(m);
		
		return i;
	}
}
