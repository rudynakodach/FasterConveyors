package com.github.rudynakodach;

import com.github.rudynakodach.content.FCBlocks;
import com.github.rudynakodach.content.FCTechTree;
import mindustry.mod.*;

public class FasterConveyors extends Mod {

    public FasterConveyors() {}

    @Override
    public void loadContent() {
        new FCBlocks().load();
        new FCTechTree().load();
    }
}
