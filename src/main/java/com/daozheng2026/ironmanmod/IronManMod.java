package com.daozheng2026.ironmanmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class IronManMod implements ModInitializer {
    public static final String MOD_ID = "ironmanmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ItemGroup IRON_MAN_GROUP = FabricItemGroupBuilder.build(
    new Identifier(MOD_ID, "iron_man_group"),
    () -> new ItemStack(IronManItems.IRON_MAN_HELMET)
    );

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Iron Man Mod");
        IronManItems.registerItems();
        IronManAbilities.registerAbilities();
        IronManRecipes.registerRecipes();
    }
}
