package com.openmodloader.examplemod;

import com.openmodloader.api.event.Event;
import com.openmodloader.loader.event.LoadEvent;

public class ExampleMod {

    @Event.Subscribe
    public void construction(LoadEvent.Construction event) {
        System.out.println("Example Mod Loading");
    }

    @Event.Subscribe
    public void construction(LoadEvent.Finalization event) {
        System.out.println("Example Mod Loaded");
    }
}
