package it.gioxox.utils;

import org.bukkit.ChatColor;

public class ColorUtils {
    public static String color(String message) {

        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
