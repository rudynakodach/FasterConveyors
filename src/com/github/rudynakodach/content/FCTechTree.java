package com.github.rudynakodach.content;

import mindustry.content.Items;
import arc.struct.Seq;
import mindustry.content.TechTree;
import mindustry.content.TechTree.TechNode;
import mindustry.ctype.UnlockableContent;
import mindustry.type.ItemStack;
import mindustry.game.Objectives.*;

import static mindustry.content.Blocks.*;

public class FCTechTree {
    private static TechNode context = null;

    public void load() {
        attachNode(titaniumConveyor, () -> {
            node(FCBlocks.thoriumConveyor, ItemStack.with(Items.thorium, 7500), () -> {
                node(FCBlocks.thoriumBridge, ItemStack.with(Items.thorium, 8000), () -> {});
            });
        });

        attachNode(pulseConduit, () -> {
            node(FCBlocks.thoriumConduit, ItemStack.with(Items.thorium, 8000, Items.metaglass, 2500, Items.titanium, 7500, Items.silicon, 2000), () -> {});
        });
    }

    private static void attachNode(UnlockableContent parent, Runnable children){
        context = TechTree.all.find(t -> t.content == parent);
        children.run();
    }

    private static void node(UnlockableContent content, ItemStack[] requirements, Seq<Objective> objectives, Runnable children){
        TechNode node = new TechNode(context, content, requirements);
        if(objectives != null) node.objectives = objectives;
        TechNode prev = context;
        context = node;
        children.run();
        context = prev;
    }

    private static void node(UnlockableContent content, ItemStack[] requirements, Runnable children){
        node(content, requirements, null, children);
    }

    private static void node(UnlockableContent content, Seq<Objective> objectives, Runnable children){
        node(content, content.researchRequirements(), objectives, children);
    }

    private static void node(UnlockableContent content, Runnable children){
        node(content, content.researchRequirements(), children);
    }

    private static void node(UnlockableContent block){
        node(block, () -> {});
    }

}
