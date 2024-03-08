package net.greg.dsgreatswords.item;

import net.greg.dsgreatswords.DarkSoulsGreatSwords;
import net.greg.dsgreatswords.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;


import java.util.List;

public class ModToolsTiers {
    public static final Tier OBSIDIAN = TierSortingRegistry.registerTier(
       new ForgeTier(5,1500,5f, 4f, 25,
           ModTags.Blocks.NEEDS_SWORDS, () -> Ingredient.of(ModItems.OBSIDIAN.get())),
       new ResourceLocation(DarkSoulsGreatSwords.MOD_ID, "obsidian"), List.of(Tiers.NETHERITE), List.of());


    public static final Tier SIF = TierSortingRegistry.registerTier(
            new ForgeTier(5,1500,5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SWORDS, () -> Ingredient.of(ModItems.SIF.get())),
            new ResourceLocation(DarkSoulsGreatSwords.MOD_ID, "sif"), List.of(Tiers.NETHERITE), List.of());


    public static final Tier ABYSS = TierSortingRegistry.registerTier(
            new ForgeTier(5,1500,5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SWORDS, () -> Ingredient.of(ModItems.ABYSS.get())),
            new ResourceLocation(DarkSoulsGreatSwords.MOD_ID, "abyss"), List.of(Tiers.NETHERITE), List.of());


    public static final Tier ROCK = TierSortingRegistry.registerTier(
            new ForgeTier(5,1500,5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SWORDS, () -> Ingredient.of(ModItems.ROCK.get())),
            new ResourceLocation(DarkSoulsGreatSwords.MOD_ID, "rock"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier CRYSTAL = TierSortingRegistry.registerTier(
            new ForgeTier(5,1500,5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SWORDS, () -> Ingredient.of(ModItems.CRYSTAL.get())),
            new ResourceLocation(DarkSoulsGreatSwords.MOD_ID, "crystal"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(5,1500,5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SWORDS, () -> Ingredient.of(ModItems.STEEL.get())),
            new ResourceLocation(DarkSoulsGreatSwords.MOD_ID, "steel"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier MOON = TierSortingRegistry.registerTier(
            new ForgeTier(5,1500,5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SWORDS, () -> Ingredient.of(ModItems.MOON.get())),
            new ResourceLocation(DarkSoulsGreatSwords.MOD_ID, "moon"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier BLACK_STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(5,1500,5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SWORDS, () -> Ingredient.of(ModItems.BLACK_STEEL.get())),
            new ResourceLocation(DarkSoulsGreatSwords.MOD_ID, "black_steel"), List.of(Tiers.NETHERITE), List.of());


    public static final Tier GWIN = TierSortingRegistry.registerTier(
            new ForgeTier(5,1500,5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SWORDS, () -> Ingredient.of(ModItems.GWIN.get())),
            new ResourceLocation(DarkSoulsGreatSwords.MOD_ID, "gwin"), List.of(Tiers.NETHERITE), List.of());

}
