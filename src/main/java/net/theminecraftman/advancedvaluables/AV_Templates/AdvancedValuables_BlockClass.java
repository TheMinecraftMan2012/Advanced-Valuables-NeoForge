package net.theminecraftman.advancedvaluables.AV_Templates;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.function.Supplier;

public class AdvancedValuables_BlockClass
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AdvancedValuables.MOD_ID);

    // -- Blocks -- //
    public static final DeferredBlock<Block> RED_SAPPHIRE_BLOCK = registerSimpleBlock("red_sapphire_block", SoundType.AMETHYST);
    public static final DeferredBlock<Block> BLUE_SAPPHIRE_BLOCK = registerSimpleBlock("blue_sapphire_block", SoundType.AMETHYST);
    public static final DeferredBlock<Block> GREEN_SAPPHIRE_BLOCK = registerSimpleBlock("green_sapphire_block", SoundType.AMETHYST);

    public static final DeferredBlock<Block> RED_GARNET_BLOCK = registerSimpleBlock("red_garnet_block", SoundType.AMETHYST);
    public static final DeferredBlock<Block> BLUE_GARNET_BLOCK = registerSimpleBlock("blue_garnet_block", SoundType.AMETHYST);
    public static final DeferredBlock<Block> PINK_GARNET_BLOCK = registerSimpleBlock("pink_garnet_block", SoundType.AMETHYST);
    public static final DeferredBlock<Block> YELLOW_GARNET_BLOCK = registerSimpleBlock("yellow_garnet_block", SoundType.AMETHYST);

    public static final DeferredBlock<Block> FUSION_BLOCK = registerSimpleFireResistantBlock("fusion_block", SoundType.NETHERITE_BLOCK);

    public static final DeferredBlock<Block> RUBY_BLOCK = registerSimpleBlock("ruby_block", SoundType.AMETHYST);

    public static final DeferredBlock<Block> RED_RAW_SAPPHIRE_BLOCK = registerSimpleBlock("red_raw_sapphire_block", SoundType.AMETHYST);
    public static final DeferredBlock<Block> BLUE_RAW_SAPPHIRE_BLOCK = registerSimpleBlock("blue_raw_sapphire_block", SoundType.AMETHYST);
    public static final DeferredBlock<Block> GREEN_RAW_SAPPHIRE_BLOCK = registerSimpleBlock("green_raw_sapphire_block", SoundType.AMETHYST);

    public static final DeferredBlock<Block> RED_RAW_GARNET_BLOCK = registerSimpleBlock("red_raw_garnet_block", SoundType.AMETHYST);
    public static final DeferredBlock<Block> BLUE_RAW_GARNET_BLOCK = registerSimpleBlock("blue_raw_garnet_block", SoundType.AMETHYST);
    public static final DeferredBlock<Block> PINK_RAW_GARNET_BLOCK = registerSimpleBlock("pink_raw_garnet_block", SoundType.AMETHYST);
    public static final DeferredBlock<Block> YELLOW_RAW_GARNET_BLOCK = registerSimpleBlock("yellow_raw_garnet_block", SoundType.AMETHYST);

    public static final DeferredBlock<Block> RAW_FUSION_BLOCK = registerSimpleFireResistantBlock("raw_fusion_block", SoundType.NETHERITE_BLOCK);

    public static final DeferredBlock<Block> RAW_RUBY_BLOCK = registerSimpleBlock("raw_ruby_block", SoundType.AMETHYST);

    // -- Ores -- // -- Stone -- //
    public static final DeferredBlock<Block> RED_SAPPHIRE_ORE = registerStoneOreBlock("red_sapphire_ore", 2, 4);
    public static final DeferredBlock<Block> BLUE_SAPPHIRE_ORE = registerStoneOreBlock("blue_sapphire_ore", 2, 4);
    public static final DeferredBlock<Block> GREEN_SAPPHIRE_ORE = registerStoneOreBlock("green_sapphire_ore", 2, 4);

    public static final DeferredBlock<Block> RED_GARNET_ORE = registerStoneOreBlock("red_garnet_ore", 2, 5);
    public static final DeferredBlock<Block> BLUE_GARNET_ORE = registerStoneOreBlock("blue_garnet_ore", 2, 5);
    public static final DeferredBlock<Block> PINK_GARNET_ORE = registerStoneOreBlock("pink_garnet_ore", 2, 5);
    public static final DeferredBlock<Block> YELLOW_GARNET_ORE = registerStoneOreBlock("yellow_garnet_ore", 2, 5);

    public static final DeferredBlock<Block> FUSION_ORE = registerStoneOreBlock("fusion_ore", 5, 10);

    public static final DeferredBlock<Block> RUBY_ORE = registerStoneOreBlock("ruby_ore", 2, 6);

    // -- Ores -- // -- Deepslate -- //
    public static final DeferredBlock<Block> DEEPSLATE_RED_SAPPHIRE_ORE = registerDeepSlateOreBlock("red_sapphire_deepslate_ore", 2, 5);
    public static final DeferredBlock<Block> DEEPSLATE_BLUE_SAPPHIRE_ORE = registerDeepSlateOreBlock("blue_sapphire_deepslate_ore", 2, 5);
    public static final DeferredBlock<Block> DEEPSLATE_GREEN_SAPPHIRE_ORE = registerDeepSlateOreBlock("green_sapphire_deepslate_ore", 2, 5);

    public static final DeferredBlock<Block> DEEPSLATE_RED_GARNET_ORE = registerDeepSlateOreBlock("red_garnet_deepslate_ore", 2, 6);
    public static final DeferredBlock<Block> DEEPSLATE_BLUE_GARNET_ORE = registerDeepSlateOreBlock("blue_garnet_deepslate_ore", 2, 6);
    public static final DeferredBlock<Block> DEEPSLATE_PINK_GARNET_ORE = registerDeepSlateOreBlock("pink_garnet_deepslate_ore", 2, 6);
    public static final DeferredBlock<Block> DEEPSLATE_YELLOW_GARNET_ORE = registerDeepSlateOreBlock("yellow_garnet_deepslate_ore", 2, 6);

    public static final DeferredBlock<Block> DEEPSLATE_FUSION_ORE = registerDeepSlateOreBlock("fusion_deepslate_ore", 6, 12);

    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerDeepSlateOreBlock("ruby_deepslate_ore", 2, 7);

    // -- Decor Blocks -- //
    // -- Red Sapphire -- //
    public static final DeferredBlock<StairBlock> RED_SAPPHIRE_STAIRS = registerBlock("red_sapphire_stairs",
            () -> new StairBlock(RED_SAPPHIRE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> RED_SAPPHIRE_SLAB = registerBlock("red_sapphire_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> RED_SAPPHIRE_PRESSURE_PLATE = registerBlock("red_sapphire_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> RED_SAPPHIRE_BUTTON = registerBlock("red_sapphire_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> RED_SAPPHIRE_FENCE = registerBlock("red_sapphire_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> RED_SAPPHIRE_FENCE_GATE = registerBlock("red_sapphire_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> RED_SAPPHIRE_WALL = registerBlock("red_sapphire_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<DoorBlock> RED_SAPPHIRE_DOOR = registerBlock("red_sapphire_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<TrapDoorBlock> RED_SAPPHIRE_TRAPDOOR = registerBlock("red_sapphire_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Blue Sapphire -- //
    public static final DeferredBlock<StairBlock> BLUE_SAPPHIRE_STAIRS = registerBlock("blue_sapphire_stairs",
            () -> new StairBlock(BLUE_SAPPHIRE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> BLUE_SAPPHIRE_SLAB = registerBlock("blue_sapphire_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> BLUE_SAPPHIRE_PRESSURE_PLATE = registerBlock("blue_sapphire_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> BLUE_SAPPHIRE_BUTTON = registerBlock("blue_sapphire_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> BLUE_SAPPHIRE_FENCE = registerBlock("blue_sapphire_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> BLUE_SAPPHIRE_FENCE_GATE = registerBlock("blue_sapphire_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> BLUE_SAPPHIRE_WALL = registerBlock("blue_sapphire_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<DoorBlock> BLUE_SAPPHIRE_DOOR = registerBlock("blue_sapphire_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<TrapDoorBlock> BLUE_SAPPHIRE_TRAPDOOR = registerBlock("blue_sapphire_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Green Sapphire -- //
    public static final DeferredBlock<StairBlock> GREEN_SAPPHIRE_STAIRS = registerBlock("green_sapphire_stairs",
            () -> new StairBlock(GREEN_SAPPHIRE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> GREEN_SAPPHIRE_SLAB = registerBlock("green_sapphire_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> GREEN_SAPPHIRE_PRESSURE_PLATE = registerBlock("green_sapphire_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> GREEN_SAPPHIRE_BUTTON = registerBlock("green_sapphire_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> GREEN_SAPPHIRE_FENCE = registerBlock("green_sapphire_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> GREEN_SAPPHIRE_FENCE_GATE = registerBlock("green_sapphire_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> GREEN_SAPPHIRE_WALL = registerBlock("green_sapphire_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<DoorBlock> GREEN_SAPPHIRE_DOOR = registerBlock("green_sapphire_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<TrapDoorBlock> GREEN_SAPPHIRE_TRAPDOOR = registerBlock("green_sapphire_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Red Garnet -- //
    public static final DeferredBlock<StairBlock> RED_GARNET_STAIRS = registerBlock("red_garnet_stairs",
            () -> new StairBlock(RED_GARNET_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> RED_GARNET_SLAB = registerBlock("red_garnet_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> RED_GARNET_PRESSURE_PLATE = registerBlock("red_garnet_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> RED_GARNET_BUTTON = registerBlock("red_garnet_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> RED_GARNET_FENCE = registerBlock("red_garnet_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> RED_GARNET_FENCE_GATE = registerBlock("red_garnet_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> RED_GARNET_WALL = registerBlock("red_garnet_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<DoorBlock> RED_GARNET_DOOR = registerBlock("red_garnet_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<TrapDoorBlock> RED_GARNET_TRAPDOOR = registerBlock("red_garnet_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Blue Garnet -- //
    public static final DeferredBlock<StairBlock> BLUE_GARNET_STAIRS = registerBlock("blue_garnet_stairs",
            () -> new StairBlock(BLUE_GARNET_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> BLUE_GARNET_SLAB = registerBlock("blue_garnet_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> BLUE_GARNET_PRESSURE_PLATE = registerBlock("blue_garnet_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> BLUE_GARNET_BUTTON = registerBlock("blue_garnet_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> BLUE_GARNET_FENCE = registerBlock("blue_garnet_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> BLUE_GARNET_FENCE_GATE = registerBlock("blue_garnet_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> BLUE_GARNET_WALL = registerBlock("blue_garnet_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<DoorBlock> BLUE_GARNET_DOOR = registerBlock("blue_garnet_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<TrapDoorBlock> BLUE_GARNET_TRAPDOOR = registerBlock("blue_garnet_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Pink Garnet -- //
    public static final DeferredBlock<StairBlock> PINK_GARNET_STAIRS = registerBlock("pink_garnet_stairs",
            () -> new StairBlock(PINK_GARNET_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> PINK_GARNET_SLAB = registerBlock("pink_garnet_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> PINK_GARNET_PRESSURE_PLATE = registerBlock("pink_garnet_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> PINK_GARNET_BUTTON = registerBlock("pink_garnet_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> PINK_GARNET_FENCE = registerBlock("pink_garnet_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> PINK_GARNET_FENCE_GATE = registerBlock("pink_garnet_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> PINK_GARNET_WALL = registerBlock("pink_garnet_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<DoorBlock> PINK_GARNET_DOOR = registerBlock("pink_garnet_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<TrapDoorBlock> PINK_GARNET_TRAPDOOR = registerBlock("pink_garnet_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Yellow Garnet -- //
    public static final DeferredBlock<StairBlock> YELLOW_GARNET_STAIRS = registerBlock("yellow_garnet_stairs",
            () -> new StairBlock(YELLOW_GARNET_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> YELLOW_GARNET_SLAB = registerBlock("yellow_garnet_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> YELLOW_GARNET_PRESSURE_PLATE = registerBlock("yellow_garnet_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> YELLOW_GARNET_BUTTON = registerBlock("yellow_garnet_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> YELLOW_GARNET_FENCE = registerBlock("yellow_garnet_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> YELLOW_GARNET_FENCE_GATE = registerBlock("yellow_garnet_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> YELLOW_GARNET_WALL = registerBlock("yellow_garnet_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<DoorBlock> YELLOW_GARNET_DOOR = registerBlock("yellow_garnet_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<TrapDoorBlock> YELLOW_GARNET_TRAPDOOR = registerBlock("yellow_garnet_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Fusion Gem -- //
    public static final DeferredBlock<StairBlock> FUSION_STAIRS = registerBlock("fusion_stairs",
            () -> new StairBlock(FUSION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> FUSION_SLAB = registerBlock("fusion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> FUSION_PRESSURE_PLATE = registerBlock("fusion_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> FUSION_BUTTON = registerBlock("fusion_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> FUSION_FENCE = registerBlock("fusion_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> FUSION_FENCE_GATE = registerBlock("fusion_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> FUSION_WALL = registerBlock("fusion_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<DoorBlock> FUSION_DOOR = registerBlock("fusion_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<TrapDoorBlock> FUSION_TRAPDOOR = registerBlock("fusion_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Ruby -- //
    public static final DeferredBlock<StairBlock> RUBY_STAIRS = registerBlock("ruby_stairs",
            () -> new StairBlock(RUBY_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> RUBY_SLAB = registerBlock("ruby_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> RUBY_BUTTON = registerBlock("ruby_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> RUBY_FENCE = registerBlock("ruby_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> RUBY_WALL = registerBlock("ruby_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<DoorBlock> RUBY_DOOR = registerBlock("ruby_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<TrapDoorBlock> RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Functions -- //

    private static DeferredBlock<Block> registerStoneOreBlock(String name, int minValue, int maxValue)
    {
        return registerBlock(name, () -> new DropExperienceBlock(UniformInt.of(minValue, maxValue), BlockBehaviour.Properties.of().strength(4f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    }

    private static DeferredBlock<Block> registerDeepSlateOreBlock(String name, int minValue, int maxValue)
    {
        return registerBlock(name, () -> new DropExperienceBlock(UniformInt.of(minValue, maxValue), BlockBehaviour.Properties.of().strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    }

    private static DeferredBlock<Block> registerSimpleBlock(String name, SoundType soundType)
    {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of()
                .strength(4f)
                .sound(soundType)
                .requiresCorrectToolForDrops()));
    }

    private static DeferredBlock<Block> registerSimpleFireResistantBlock(String name, SoundType soundType)
    {
        return registerFireResistantBlock(name, () -> new Block(BlockBehaviour.Properties.of()
                .strength(4f)
                .sound(soundType)
                .requiresCorrectToolForDrops()));
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block)
    {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block)
    {
        AdvancedValuables_ItemClass.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> registerFireResistantBlock(String name, Supplier<T> block)
    {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerFireResistantBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerFireResistantBlockItem(String name, DeferredBlock<T> block)
    {
        AdvancedValuables_ItemClass.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
