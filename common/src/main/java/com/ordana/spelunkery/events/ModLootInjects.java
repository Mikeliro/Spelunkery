package com.ordana.spelunkery.events;

import com.ordana.spelunkery.Spelunkery;
import net.mehvahdjukaar.moonlight.api.platform.ForgeHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;

import java.util.function.Consumer;

public class ModLootInjects {

    public static void onLootInject(LootTables lootManager, ResourceLocation name, Consumer<LootPool.Builder> builderConsumer) {

        if (name.equals(new ResourceLocation("minecraft", "chests/abandoned_mineshaft"))) {
            {
                LootPool.Builder pool = LootPool.lootPool();
                String id = "mineshaft";
                pool.add(LootTableReference.lootTableReference(Spelunkery.res("injects/" + id)));
                ForgeHelper.setPoolName(pool, "spelunkery_" + id);
                builderConsumer.accept(pool);
            }
        }
        if (name.equals(new ResourceLocation("minecraft", "chests/stronghold_library"))) {
            {
                LootPool.Builder pool = LootPool.lootPool();
                String id = "stronghold_library";
                pool.add(LootTableReference.lootTableReference(Spelunkery.res("injects/" + id)));
                ForgeHelper.setPoolName(pool, "spelunkery_" + id);
                builderConsumer.accept(pool);
            }
        }
        if (name.equals(new ResourceLocation("minecraft", "chests/ancient_city"))) {
            {
                LootPool.Builder pool = LootPool.lootPool();
                String id = "ancient_city";
                pool.add(LootTableReference.lootTableReference(Spelunkery.res("injects/" + id)));
                ForgeHelper.setPoolName(pool, "spelunkery_" + id);
                builderConsumer.accept(pool);
            }
        }
    }
}
