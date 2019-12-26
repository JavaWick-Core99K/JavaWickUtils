package me.javawick.util.recipe;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

public class CustomRecipe {

	private Plugin plugin;
	private ItemStack item;
	private NamespacedKey key;
	private ShapedRecipe recipe;
	
	public CustomRecipe(Plugin pl, String keyName, ItemStack i) {
		plugin = pl;
		key = new NamespacedKey(pl, keyName);
		recipe = new ShapedRecipe(key, i);
		item = i;
	}
	
	/**
	 * Gets the item that is made by crafting
	 * 
	 * @return ItemStack - the item
	 */
	public ItemStack getItem() {
		return item;
	}
	
	/**
	 * Overrides the item with another item
	 * 
	 * @param i - the item used to override
	 * @return ItemStack - the item
	 */
	public ItemStack setItem(ItemStack i) {
		item = i;
		recipe = null;
		recipe = new ShapedRecipe(key, item);
		return item;
	}
	
	/**
	 * Sets the crafting shape of the recipe
	 * 
	 * @param top - the top layer of the crafting table
	 * @param mid - the middle layer of the crafting table
	 * @param bottom - the bottom layer of the crafting table
	 */
	public void setShape(String top, String mid, String bottom) {
		recipe.shape(top, mid, bottom);
	}
	
	/**
	 * Sets the ingredients of the recipe
	 * 
	 * @param c - the character used in the crafting shape
	 * @param type - the type of material
	 */
	public void setIngredient(char c, Material type) {
		recipe.setIngredient(c, type);
	}
	
	/**
	 * Registers the recipe into the server
	 */
	public void registerRecipe() {
		plugin.getServer().addRecipe(recipe);
	}
}
