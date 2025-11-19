package com.github.mutusugu.introductionmod.item;

import com.github.mutusugu.introductionmod.IntroductionMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IntroductionItems {
    //　レジストリ作成
    public static final DeferredRegister<Item>ITEMES = DeferredRegister.create(ForgeRegistries.ITEMS, IntroductionMod.MOD_ID);

    //レジストリにアイテムを追加
    public static final RegistryObject<Item> RAW_ORIHALCON = ITEMES.register("row_orihalcon" , () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        // レジストリをイベントパスに登録
        ITEMES.register(eventBus);
    }
}
