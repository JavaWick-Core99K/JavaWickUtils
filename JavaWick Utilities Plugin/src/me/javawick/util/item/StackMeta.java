package me.javawick.util.item;

import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class StackMeta {

	/**
	 * Makes the item unbreakable
	 * 
	 * @param item - the item to use
	 * @param b - sets the unbreakable tag
	 * @param hideFlag - hides the unbreakable tag
	 * @return ItemStack - the item
	 */
	public static ItemStack unbreakable(ItemStack item, boolean b, boolean hideFlag) {
		ItemMeta m = item.getItemMeta();
		
		if(hideFlag)
			m.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		
		m.setUnbreakable(b);
		item.setItemMeta(m);
		
		return item;
	}
}
