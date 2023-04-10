package com.github.rudynakodach.content;

import mindustry.content.Items;
import mindustry.content.TechTree;
import mindustry.core.ContentLoader;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.Conveyor;

import static mindustry.type.ItemStack.with;

public class FCBlocks extends ContentLoader {
    public static Block thoriumConveyor;

    @Override
    public void load() {
        thoriumConveyor = new Conveyor("thorium-conveyor"){{
           requirements(Category.distribution, with(Items.graphite, 2, Items.silicon, 2, Items.thorium, 3));
           speed = .1f;
           displayedSpeed = 14;
           health = 120;
           canOverdrive = true;
           size = 1;

        }};
    }
}
