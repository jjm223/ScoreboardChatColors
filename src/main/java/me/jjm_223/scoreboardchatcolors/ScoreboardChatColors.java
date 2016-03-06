package me.jjm_223.scoreboardchatcolors;

import org.bukkit.plugin.java.JavaPlugin;

public class ScoreboardChatColors extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }
}
