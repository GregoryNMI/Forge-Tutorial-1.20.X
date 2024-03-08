package net.greg.dsgreatswords.item;

import net.greg.dsgreatswords.DarkSoulsGreatSwords;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DarkSoulsGreatSwords.MOD_ID);



    public static final RegistryObject<Item> OBSIDIAN = ITEMS.register("obsidian",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GWIN = ITEMS.register("gwin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SIF = ITEMS.register("sif",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ABYSS = ITEMS.register("abyss",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROCK = ITEMS.register("rock",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOON = ITEMS.register("moon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_STEEL = ITEMS.register("black_steel",
            () -> new Item(new Item.Properties()));





    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(ModToolsTiers.OBSIDIAN, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> GL_SWORD = ITEMS.register("gl_sword",
            () -> new SwordItem(ModToolsTiers.GWIN, 4, -3, new Item.Properties()));


    public static final RegistryObject<Item> ARTORIAS_SWORD = ITEMS.register("artorias_sword",
            () -> new SwordItem(ModToolsTiers.SIF, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> CURSED_SWORD = ITEMS.register("cursed_sword",
            () -> new SwordItem(ModToolsTiers.SIF, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> ABYSS_SWORD = ITEMS.register("abyss_sword",
            () -> new SwordItem(ModToolsTiers.ABYSS, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> STONE_SWORD = ITEMS.register("stone_sword",
            () -> new SwordItem(ModToolsTiers.ROCK, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> CRYSTAL_SWORD = ITEMS.register("crystal_sword",
            () -> new SwordItem(ModToolsTiers.CRYSTAL, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> CLAYMORE = ITEMS.register("claymore_sword",
            () -> new SwordItem(ModToolsTiers.STEEL, 4, -2, new Item.Properties()));

    public static final RegistryObject<Item> FLAMBERGE = ITEMS.register("flamberge_sword",
            () -> new SwordItem(ModToolsTiers.STEEL, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> SERPENT_SWORD = ITEMS.register("serpent_sword",
            () -> new SwordItem(ModToolsTiers.STEEL, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> BASTARD_SWORD = ITEMS.register("bastard_sword",
            () -> new SwordItem(ModToolsTiers.STEEL, 3, -2, new Item.Properties()));



    public static final RegistryObject<Item> MOONLIGHT = ITEMS.register("moonlight_sword",
            () -> new SwordItem(ModToolsTiers.MOON, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> BLACK_KNIGHT_SWORD = ITEMS.register("black_knight_sword",
            () -> new SwordItem(ModToolsTiers.BLACK_STEEL, 5, -3, new Item.Properties()));








    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}


}
