
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.japanv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.japanv.item.AxelightItem;
import net.mcreator.japanv.JapanvMod;

public class JapanvModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JapanvMod.MODID);
	public static final RegistryObject<Item> BARBGECKO = REGISTRY.register("barbgecko_spawn_egg",
			() -> new ForgeSpawnEggItem(JapanvModEntities.BARBGECKO, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> AXELIGHT = REGISTRY.register("axelight", () -> new AxelightItem());
}
