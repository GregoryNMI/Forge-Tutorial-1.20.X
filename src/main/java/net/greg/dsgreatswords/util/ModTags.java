package net.greg.dsgreatswords.util;

import net.greg.dsgreatswords.DarkSoulsGreatSwords;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SWORDS = tag("needs_swords");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(DarkSoulsGreatSwords.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(DarkSoulsGreatSwords.MOD_ID, name));
        }
    }


}
