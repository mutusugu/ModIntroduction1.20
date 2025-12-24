package com.github.mutusugu.introductionmod.item;

import com.github.mutusugu.introductionmod.IntroductionMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.awt.event.InputEvent;

public class IntroductionTabs {
    //　レジストリを作成
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IntroductionMod.MOD_ID);

    // レジストリにタブを登録
    public static final RegistryObject<CreativeModeTab> INTRODUCTION_TAB = TABS.register("introduction_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.introduction_tab"))
                    .icon(IntroductionmodItems.RAW_ORIHALCON.get()::getDefaultInstance)
                    .displayItems(((qParameters, q0utput) ->{
                        q0utput.accept(IntroductionmodItems.RAW_ORIHALCON.get());
                        q0utput.accept(IntroductionmodItems.ORHALCON_INGOT.get());
                        q0utput.accept(IntroductionmodItems.OSUMIUMU.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
