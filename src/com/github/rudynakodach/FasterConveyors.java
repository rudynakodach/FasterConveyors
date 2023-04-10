package com.github.rudynakodach;

import arc.*;
import arc.util.*;
import com.github.rudynakodach.content.FCBlocks;
import com.github.rudynakodach.content.FCTechTree;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class FasterConveyors extends Mod {

    public FasterConveyors() {}

    @Override
    public void loadContent() {
        Log.info("Loading some example content.");
        new FCBlocks().load();
        new FCTechTree().load();
    }

}
