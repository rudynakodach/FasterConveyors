package com.github.rudynakodach.content;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.world.blocks.liquid.Conduit;

import static mindustry.type.ItemStack.with;

public class FCBlocks {
    public static Block thoriumConveyor, thoriumConduit;

    public void load() {
        thoriumConveyor = new Conveyor("thorium-conveyor"){{
           requirements(Category.distribution, with(Items.graphite, 2, Items.thorium, 3, Items.copper, 7, Items.lead, 6, Items.titanium, 4));
           speed = .1f;
           displayedSpeed = 14;
           health = 120;
           canOverdrive = true;
           size = 1;

        }};

        thoriumConduit = new Conduit("thorium-conduit") {{
            requirements(Category.liquid, with(Items.metaglass, 3, Items.thorium, 8, Items.titanium, 6));

            canOverdrive = true;
            liquidCapacity = 20;
            health = 250;
            size = 1;
        }};
    }
}
