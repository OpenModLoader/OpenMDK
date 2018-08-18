package com.openmodloader.examplemod;

import com.openmodloader.api.event.Event;
import com.openmodloader.loader.event.LoadEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ExampleMod {
    private static final Logger LOGGER = LogManager.getLogger("examplemod");

    @Event.Subscribe
    public void onConstruction(LoadEvent.Construction event) {
        ExampleMod.LOGGER.info("Example Mod loading");
    }

    @Event.Subscribe
    public void onFinalization(LoadEvent.Finalization event) {
        ExampleMod.LOGGER.info("Example Mod loaded");
    }
}
