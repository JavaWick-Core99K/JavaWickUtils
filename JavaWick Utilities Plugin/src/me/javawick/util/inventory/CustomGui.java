package me.javawick.util.inventory;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.javawick.util.chat.Color;

public class CustomGui {

	private Inventory inv;
	private String name;
	private String displayName;
	private int size;
	
	public CustomGui(String name, String display, int rows) {
		this.name = name;
		displayName = Color.chat(display);
		size = rows * 9;
		inv = Bukkit.createInventory(null, size, displayName);
	}
	
	/**
	 * Creates the inventory with assigned items
	 * 
	 * @param items - the stack of items
	 */
	public void setItems(ItemStack[] items) {
		inv.setContents(items);
	}
	
	/**
	 * Access the inventory
	 * 
	 * @return Inventory - the inventory
	 */
	public Inventory inv() {
		return inv;
	}
	
	/**
	 * Gets the name of the gui
	 * 
	 * @return String - name of inventory
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the display name of the gui
	 * 
	 * @return String - name of inventory
	 */
	public String getDisplayName() {
		return displayName;
	}
	
	/**
	 * Gets the size of the inventory
	 * 
	 * @return int - number of slots in the inventory
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Get items from the gui
	 * 
	 * @return ItemStack[] - the stack of items
	 */
	public ItemStack[] getItems() {
		return inv.getStorageContents();
	}
}
