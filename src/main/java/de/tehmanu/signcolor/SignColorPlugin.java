package de.tehmanu.signcolor;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class SignColorPlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new SignColorListener(), this);
	}
}
