package com.github.rudynakodach.content;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.BufferedItemBridge;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.world.blocks.liquid.Conduit;

import static mindustry.type.ItemStack.with;

public class FCBlocks {
    public static Block thoriumConveyor, thoriumBridge, thoriumConduit;

    public void load() {
        thoriumConveyor = new Conveyor("thorium-conveyor"){{
           requirements(Category.distribution, with( Items.thorium, 3, Items.copper, 4, Items.lead, 6, Items.titanium, 4));

           speed = .1f;
           displayedSpeed = 14;
           health = 120;
           armor = 1;
           canOverdrive = true;
           size = 1;
        }};

        thoriumBridge = new BufferedItemBridge("thorium-bridge") {{
            requirements(Category.distribution, with(Items.thorium, 6, Items.copper, 4, Items.lead, 9, Items.titanium, 6));

            size = 1;
            canOverdrive = true;
            health = 100;
            range = 5;
            speed = .1f;
            acceptsItems = true;
            itemCapacity = 15;
        }};

        thoriumConduit = new Conduit("thorium-conduit") {{
            requirements(Category.liquid, with(Items.metaglass, 3, Items.thorium, 8, Items.titanium, 6, Items.lead, 6, Items.copper, 4));

            canOverdrive = true;
            liquidCapacity = 20;
            health = 250;
            size = 1;
        }};
    }
}
