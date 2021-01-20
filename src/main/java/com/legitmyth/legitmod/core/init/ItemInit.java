package com.legitmyth.legitmod.core.init;


import com.legitmyth.legitmod.LegitMod;
import com.legitmyth.legitmod.common.items.SpecialItem;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			LegitMod.MOD_ID);
	
	public static final RegistryObject<Item> LEGITIMITE_INGOT = ITEMS.register("legitimite_ingot", 
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<SpecialItem> SPECIAL_ITEM = ITEMS.register("special_item", 
			() -> new SpecialItem(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> LEGITIMITE_PICAXE = ITEMS.register("legitimite_picaxe", 
			() -> new Item(new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> KNOWN_INGOT = ITEMS.register("known_ingot",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	// Block Items
	public static final RegistryObject<BlockItem> LEGITIMITE_BLOCK = ITEMS.register("legitimite_block", 
				() -> new BlockItem(BlockInit.LEGITIMITE_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> LEGITIMITE_ORE = ITEMS.register("legitimite_ore", 
			() -> new BlockItem(BlockInit.LEGITIMITE_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> JAY_BLOCK = ITEMS.register("jay_block", 
			() -> new BlockItem(BlockInit.JAY_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	}
