package de.tehmanu.signcolor;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class SignColorListener implements Listener {

	@EventHandler
	public void handleSignChange(SignChangeEvent event) {
		String[] lines = event.getLines();
		for (int i = 0; i < lines.length; i++) {
			event.setLine(i, lines[i].replaceAll("&", "§"));
		}
	}
}
