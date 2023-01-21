package it.gioxox;

import it.gioxox.commands.social;
import org.bukkit.plugin.java.JavaPlugin;

public final class Gioxox extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin Online");

        this.getCommand("social").setExecutor(new social());
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin offline");
    }
}
