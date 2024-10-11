package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
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

        stairsBlock(((StairBlock) AdvancedValuables_BlockClass.RED_SAPPHIRE_STAIRS.get()), blockTexture(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get()));
        stairsBlock(((StairBlock) AdvancedValuables_BlockClass.BLUE_SAPPHIRE_STAIRS.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get()));
        stairsBlock(((StairBlock) AdvancedValuables_BlockClass.GREEN_SAPPHIRE_STAIRS.get()), blockTexture(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get()));
        stairsBlock(((StairBlock) AdvancedValuables_BlockClass.RED_GARNET_STAIRS.get()), blockTexture(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get()));
        stairsBlock(((StairBlock) AdvancedValuables_BlockClass.BLUE_GARNET_STAIRS.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get()));
        stairsBlock(((StairBlock) AdvancedValuables_BlockClass.PINK_GARNET_STAIRS.get()), blockTexture(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get()));
        stairsBlock(((StairBlock) AdvancedValuables_BlockClass.YELLOW_GARNET_STAIRS.get()), blockTexture(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get()));
        stairsBlock(((StairBlock) AdvancedValuables_BlockClass.FUSION_STAIRS.get()), blockTexture(AdvancedValuables_BlockClass.FUSION_BLOCK.get()));
        stairsBlock(((StairBlock) AdvancedValuables_BlockClass.RUBY_STAIRS.get()), blockTexture(AdvancedValuables_BlockClass.RUBY_BLOCK.get()));

        slabBlock(((SlabBlock) AdvancedValuables_BlockClass.RED_SAPPHIRE_SLAB.get()), blockTexture(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get()), blockTexture(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get()));
        slabBlock(((SlabBlock) AdvancedValuables_BlockClass.BLUE_SAPPHIRE_SLAB.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get()));
        slabBlock(((SlabBlock) AdvancedValuables_BlockClass.GREEN_SAPPHIRE_SLAB.get()), blockTexture(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get()), blockTexture(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get()));
        slabBlock(((SlabBlock) AdvancedValuables_BlockClass.RED_GARNET_SLAB.get()), blockTexture(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get()), blockTexture(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get()));
        slabBlock(((SlabBlock) AdvancedValuables_BlockClass.BLUE_GARNET_SLAB.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get()));
        slabBlock(((SlabBlock) AdvancedValuables_BlockClass.PINK_GARNET_SLAB.get()), blockTexture(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get()), blockTexture(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get()));
        slabBlock(((SlabBlock) AdvancedValuables_BlockClass.YELLOW_GARNET_SLAB.get()), blockTexture(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get()), blockTexture(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get()));
        slabBlock(((SlabBlock) AdvancedValuables_BlockClass.FUSION_SLAB.get()), blockTexture(AdvancedValuables_BlockClass.FUSION_BLOCK.get()), blockTexture(AdvancedValuables_BlockClass.FUSION_BLOCK.get()));
        slabBlock(((SlabBlock) AdvancedValuables_BlockClass.RUBY_SLAB.get()), blockTexture(AdvancedValuables_BlockClass.RUBY_BLOCK.get()), blockTexture(AdvancedValuables_BlockClass.RUBY_BLOCK.get()));

        pressurePlateBlock(((PressurePlateBlock) AdvancedValuables_BlockClass.RED_SAPPHIRE_PRESSURE_PLATE.get()), blockTexture(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) AdvancedValuables_BlockClass.BLUE_SAPPHIRE_PRESSURE_PLATE.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) AdvancedValuables_BlockClass.GREEN_SAPPHIRE_PRESSURE_PLATE.get()), blockTexture(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) AdvancedValuables_BlockClass.RED_GARNET_PRESSURE_PLATE.get()), blockTexture(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) AdvancedValuables_BlockClass.BLUE_GARNET_PRESSURE_PLATE.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) AdvancedValuables_BlockClass.PINK_GARNET_PRESSURE_PLATE.get()), blockTexture(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) AdvancedValuables_BlockClass.YELLOW_GARNET_PRESSURE_PLATE.get()), blockTexture(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) AdvancedValuables_BlockClass.FUSION_PRESSURE_PLATE.get()), blockTexture(AdvancedValuables_BlockClass.FUSION_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) AdvancedValuables_BlockClass.RUBY_PRESSURE_PLATE.get()), blockTexture(AdvancedValuables_BlockClass.RUBY_BLOCK.get()));

        buttonBlock(((ButtonBlock) AdvancedValuables_BlockClass.RED_SAPPHIRE_BUTTON.get()), blockTexture(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get()));
        buttonBlock(((ButtonBlock) AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BUTTON.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get()));
        buttonBlock(((ButtonBlock) AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BUTTON.get()), blockTexture(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get()));
        buttonBlock(((ButtonBlock) AdvancedValuables_BlockClass.RED_GARNET_BUTTON.get()), blockTexture(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get()));
        buttonBlock(((ButtonBlock) AdvancedValuables_BlockClass.BLUE_GARNET_BUTTON.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get()));
        buttonBlock(((ButtonBlock) AdvancedValuables_BlockClass.PINK_GARNET_BUTTON.get()), blockTexture(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get()));
        buttonBlock(((ButtonBlock) AdvancedValuables_BlockClass.YELLOW_GARNET_BUTTON.get()), blockTexture(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get()));
        buttonBlock(((ButtonBlock) AdvancedValuables_BlockClass.FUSION_BUTTON.get()), blockTexture(AdvancedValuables_BlockClass.FUSION_BLOCK.get()));
        buttonBlock(((ButtonBlock) AdvancedValuables_BlockClass.RUBY_BUTTON.get()), blockTexture(AdvancedValuables_BlockClass.RUBY_BLOCK.get()));

        fenceBlock(((FenceBlock) AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE.get()), blockTexture(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get()));
        fenceBlock(((FenceBlock) AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get()));
        fenceBlock(((FenceBlock) AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE.get()), blockTexture(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get()));
        fenceBlock(((FenceBlock) AdvancedValuables_BlockClass.RED_GARNET_FENCE.get()), blockTexture(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get()));
        fenceBlock(((FenceBlock) AdvancedValuables_BlockClass.BLUE_GARNET_FENCE.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get()));
        fenceBlock(((FenceBlock) AdvancedValuables_BlockClass.PINK_GARNET_FENCE.get()), blockTexture(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get()));
        fenceBlock(((FenceBlock) AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE.get()), blockTexture(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get()));
        fenceBlock(((FenceBlock) AdvancedValuables_BlockClass.FUSION_FENCE.get()), blockTexture(AdvancedValuables_BlockClass.FUSION_BLOCK.get()));
        fenceBlock(((FenceBlock) AdvancedValuables_BlockClass.RUBY_FENCE.get()), blockTexture(AdvancedValuables_BlockClass.RUBY_BLOCK.get()));

        fenceGateBlock(((FenceGateBlock) AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE_GATE.get()), blockTexture(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE_GATE.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE_GATE.get()), blockTexture(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) AdvancedValuables_BlockClass.RED_GARNET_FENCE_GATE.get()), blockTexture(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) AdvancedValuables_BlockClass.BLUE_GARNET_FENCE_GATE.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) AdvancedValuables_BlockClass.PINK_GARNET_FENCE_GATE.get()), blockTexture(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE_GATE.get()), blockTexture(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) AdvancedValuables_BlockClass.FUSION_FENCE_GATE.get()), blockTexture(AdvancedValuables_BlockClass.FUSION_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) AdvancedValuables_BlockClass.RUBY_FENCE_GATE.get()), blockTexture(AdvancedValuables_BlockClass.RUBY_BLOCK.get()));

        wallBlock(((WallBlock) AdvancedValuables_BlockClass.RED_SAPPHIRE_WALL.get()), blockTexture(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get()));
        wallBlock(((WallBlock) AdvancedValuables_BlockClass.BLUE_SAPPHIRE_WALL.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get()));
        wallBlock(((WallBlock) AdvancedValuables_BlockClass.GREEN_SAPPHIRE_WALL.get()), blockTexture(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get()));
        wallBlock(((WallBlock) AdvancedValuables_BlockClass.RED_GARNET_WALL.get()), blockTexture(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get()));
        wallBlock(((WallBlock) AdvancedValuables_BlockClass.BLUE_GARNET_WALL.get()), blockTexture(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get()));
        wallBlock(((WallBlock) AdvancedValuables_BlockClass.PINK_GARNET_WALL.get()), blockTexture(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get()));
        wallBlock(((WallBlock) AdvancedValuables_BlockClass.YELLOW_GARNET_WALL.get()), blockTexture(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get()));
        wallBlock(((WallBlock) AdvancedValuables_BlockClass.FUSION_WALL.get()), blockTexture(AdvancedValuables_BlockClass.FUSION_BLOCK.get()));
        wallBlock(((WallBlock) AdvancedValuables_BlockClass.RUBY_WALL.get()), blockTexture(AdvancedValuables_BlockClass.RUBY_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) AdvancedValuables_BlockClass.RED_SAPPHIRE_DOOR.get()), modLoc("block/red_sapphire_door_bottom"), modLoc("block/red_sapphire_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) AdvancedValuables_BlockClass.BLUE_SAPPHIRE_DOOR.get()), modLoc("block/blue_sapphire_door_bottom"), modLoc("block/blue_sapphire_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) AdvancedValuables_BlockClass.GREEN_SAPPHIRE_DOOR.get()), modLoc("block/green_sapphire_door_bottom"), modLoc("block/green_sapphire_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) AdvancedValuables_BlockClass.RED_GARNET_DOOR.get()), modLoc("block/red_garnet_door_bottom"), modLoc("block/red_garnet_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) AdvancedValuables_BlockClass.BLUE_GARNET_DOOR.get()), modLoc("block/blue_garnet_door_bottom"), modLoc("block/blue_garnet_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) AdvancedValuables_BlockClass.PINK_GARNET_DOOR.get()), modLoc("block/pink_garnet_door_bottom"), modLoc("block/pink_garnet_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) AdvancedValuables_BlockClass.YELLOW_GARNET_DOOR.get()), modLoc("block/yellow_garnet_door_bottom"), modLoc("block/yellow_garnet_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) AdvancedValuables_BlockClass.FUSION_DOOR.get()), modLoc("block/fusion_door_bottom"), modLoc("block/fusion_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) AdvancedValuables_BlockClass.RUBY_DOOR.get()), modLoc("block/ruby_door_bottom"), modLoc("block/ruby_door_top"), "cutout");

        trapdoorBlockWithRenderType(((TrapDoorBlock) AdvancedValuables_BlockClass.RED_SAPPHIRE_TRAPDOOR.get()), modLoc("block/red_sapphire_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) AdvancedValuables_BlockClass.BLUE_SAPPHIRE_TRAPDOOR.get()), modLoc("block/blue_sapphire_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) AdvancedValuables_BlockClass.GREEN_SAPPHIRE_TRAPDOOR.get()), modLoc("block/green_sapphire_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) AdvancedValuables_BlockClass.RED_GARNET_TRAPDOOR.get()), modLoc("block/red_garnet_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) AdvancedValuables_BlockClass.BLUE_GARNET_TRAPDOOR.get()), modLoc("block/blue_garnet_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) AdvancedValuables_BlockClass.PINK_GARNET_TRAPDOOR.get()), modLoc("block/pink_garnet_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) AdvancedValuables_BlockClass.YELLOW_GARNET_TRAPDOOR.get()), modLoc("block/yellow_garnet_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) AdvancedValuables_BlockClass.FUSION_TRAPDOOR.get()), modLoc("block/fusion_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) AdvancedValuables_BlockClass.RUBY_TRAPDOOR.get()), modLoc("block/ruby_trapdoor"), true, "cutout");

        blockItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_STAIRS);
        blockItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_SLAB);
        blockItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_PRESSURE_PLATE);
        blockItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE_GATE);
        blockItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_TRAPDOOR, "_bottom");

        blockItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_STAIRS);
        blockItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_SLAB);
        blockItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_PRESSURE_PLATE);
        blockItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE_GATE);
        blockItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_TRAPDOOR, "_bottom");

        blockItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_STAIRS);
        blockItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_SLAB);
        blockItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_PRESSURE_PLATE);
        blockItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE_GATE);
        blockItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_TRAPDOOR, "_bottom");

        blockItem(AdvancedValuables_BlockClass.RED_GARNET_STAIRS);
        blockItem(AdvancedValuables_BlockClass.RED_GARNET_SLAB);
        blockItem(AdvancedValuables_BlockClass.RED_GARNET_PRESSURE_PLATE);
        blockItem(AdvancedValuables_BlockClass.RED_GARNET_FENCE_GATE);
        blockItem(AdvancedValuables_BlockClass.RED_GARNET_TRAPDOOR, "_bottom");

        blockItem(AdvancedValuables_BlockClass.BLUE_GARNET_STAIRS);
        blockItem(AdvancedValuables_BlockClass.BLUE_GARNET_SLAB);
        blockItem(AdvancedValuables_BlockClass.BLUE_GARNET_PRESSURE_PLATE);
        blockItem(AdvancedValuables_BlockClass.BLUE_GARNET_FENCE_GATE);
        blockItem(AdvancedValuables_BlockClass.BLUE_GARNET_TRAPDOOR, "_bottom");

        blockItem(AdvancedValuables_BlockClass.PINK_GARNET_STAIRS);
        blockItem(AdvancedValuables_BlockClass.PINK_GARNET_SLAB);
        blockItem(AdvancedValuables_BlockClass.PINK_GARNET_PRESSURE_PLATE);
        blockItem(AdvancedValuables_BlockClass.PINK_GARNET_FENCE_GATE);
        blockItem(AdvancedValuables_BlockClass.PINK_GARNET_TRAPDOOR, "_bottom");

        blockItem(AdvancedValuables_BlockClass.YELLOW_GARNET_STAIRS);
        blockItem(AdvancedValuables_BlockClass.YELLOW_GARNET_SLAB);
        blockItem(AdvancedValuables_BlockClass.YELLOW_GARNET_PRESSURE_PLATE);
        blockItem(AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE_GATE);
        blockItem(AdvancedValuables_BlockClass.YELLOW_GARNET_TRAPDOOR, "_bottom");

        blockItem(AdvancedValuables_BlockClass.FUSION_STAIRS);
        blockItem(AdvancedValuables_BlockClass.FUSION_SLAB);
        blockItem(AdvancedValuables_BlockClass.FUSION_PRESSURE_PLATE);
        blockItem(AdvancedValuables_BlockClass.FUSION_FENCE_GATE);
        blockItem(AdvancedValuables_BlockClass.FUSION_TRAPDOOR, "_bottom");

        blockItem(AdvancedValuables_BlockClass.RUBY_STAIRS);
        blockItem(AdvancedValuables_BlockClass.RUBY_SLAB);
        blockItem(AdvancedValuables_BlockClass.RUBY_PRESSURE_PLATE);
        blockItem(AdvancedValuables_BlockClass.RUBY_FENCE_GATE);
        blockItem(AdvancedValuables_BlockClass.RUBY_TRAPDOOR, "_bottom");
    }

    private void blockWithItem(DeferredBlock<Block> deferredBlock)
    {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
    private void blockItem(DeferredBlock<?> deferredBlock)
    {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("advancedvaluables:block/" + deferredBlock.getId().getPath()));
    }
    private void blockItem(DeferredBlock<?> deferredBlock, String appendix)
    {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("advancedvaluables:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
