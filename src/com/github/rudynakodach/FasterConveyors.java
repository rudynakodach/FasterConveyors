package com.github.rudynakodach;

import arc.*;
import arc.util.*;
import com.github.rudynakodach.content.FCBlocks;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class FasterConveyors extends Mod{

    public FasterConveyors(){
        Log.info("Loaded FasterConveyors constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                dialog.cont.image(Core.atlas.find("faster-conveyors-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
        new FCBlocks().load();
    }

}
