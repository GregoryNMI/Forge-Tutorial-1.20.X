package net.greg.dsgreatswords.datagen;

import net.greg.dsgreatswords.DarkSoulsGreatSwords;
import net.greg.dsgreatswords.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DarkSoulsGreatSwords.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        handheldItem(ModItems.OBSIDIAN_SWORD);
        handheldItem(ModItems.GL_SWORD);
        handheldItem(ModItems.ARTORIAS_SWORD);
        handheldItem(ModItems.CURSED_SWORD);
        handheldItem(ModItems.ABYSS_SWORD);
        handheldItem(ModItems.STONE_SWORD);
        handheldItem(ModItems.CRYSTAL_SWORD);
        handheldItem(ModItems.CLAYMORE);
        handheldItem(ModItems.FLAMBERGE);
        handheldItem(ModItems.SERPENT_SWORD);
        handheldItem(ModItems.BASTARD_SWORD);
        handheldItem(ModItems.MOONLIGHT);
        handheldItem(ModItems.BLACK_KNIGHT_SWORD);


    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(DarkSoulsGreatSwords.MOD_ID, "item/" + item.getId().getPath()));
    }

}
