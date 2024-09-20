package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_BlockStateProvider extends BlockStateProvider
{
    public AdvancedValuables_BlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, AdvancedValuables.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        blockWithItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.RED_GARNET_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.FUSION_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.RUBY_BLOCK);

        blockWithItem(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK);
        blockWithItem(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK);

        blockWithItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE);
        blockWithItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE);
        blockWithItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE);
        blockWithItem(AdvancedValuables_BlockClass.RED_GARNET_ORE);
        blockWithItem(AdvancedValuables_BlockClass.BLUE_GARNET_ORE);
        blockWithItem(AdvancedValuables_BlockClass.PINK_GARNET_ORE);
        blockWithItem(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE);
        blockWithItem(AdvancedValuables_BlockClass.FUSION_ORE);
        blockWithItem(AdvancedValuables_BlockClass.RUBY_ORE);

        blockWithItem(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE);
        blockWithItem(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE);
        blockWithItem(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE);
        blockWithItem(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE);
        blockWithItem(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE);
        blockWithItem(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE);
        blockWithItem(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE);
        blockWithItem(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE);
        blockWithItem(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE);
    }

    private void blockWithItem(DeferredBlock<Block> deferredBlock)
    {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
