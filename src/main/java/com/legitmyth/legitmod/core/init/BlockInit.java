package com.legitmyth.legitmod.core.init;

import com.legitmyth.legitmod.LegitMod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			LegitMod.MOD_ID);
	
	public static final RegistryObject<Block> LEGITIMITE_BLOCK = BLOCKS.register("legitimite_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GREEN)
					.hardnessAndResistance(5f, 10f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(3)
					.sound(SoundType.METAL)
					.setRequiresTool()));
	
	public static final RegistryObject<Block> LEGITIMITE_ORE = BLOCKS.register("legitimite_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GREEN)
					.hardnessAndResistance(5f, 10f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(3)
					.sound(SoundType.STONE)
					.setRequiresTool()));
	
	public static final RegistryObject<Block> JAY_BLOCK = BLOCKS.register("jay_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GREEN)
					.hardnessAndResistance(3f, 10f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.STONE)
					.setRequiresTool()));
}

