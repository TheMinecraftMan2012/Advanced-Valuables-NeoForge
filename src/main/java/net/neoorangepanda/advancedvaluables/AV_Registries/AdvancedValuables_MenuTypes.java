package net.neoorangepanda.advancedvaluables.AV_Registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoorangepanda.advancedvaluables.AV_Screens.AV_FusionGemStation.FusionGemStationMenu;
import net.neoorangepanda.advancedvaluables.AV_Screens.AV_GemGrinder.GemGrinderMenu;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_MenuTypes
{
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, AdvancedValuables.MOD_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<GemGrinderMenu>> GEM_GRINDER_MENU = registerMenuType("growth_chamber_menu", GemGrinderMenu::new);
    public static final DeferredHolder<MenuType<?>, MenuType<FusionGemStationMenu>> FUSION_GEM_STATION_MENU = registerMenuType("fusion_gem_station_menu", FusionGemStationMenu::new);

    private static <T extends AbstractContainerMenu>DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory)
    {
        return MENUS.register(name, () -> IMenuTypeExtension.create(factory));
    }

    public static void register(IEventBus eventBus)
    {
        MENUS.register(eventBus);
    }
}
