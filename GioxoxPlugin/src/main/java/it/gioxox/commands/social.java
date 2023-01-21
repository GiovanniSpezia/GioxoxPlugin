package it.gioxox.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class social implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if ((sender instanceof Player) || (sender instanceof ConsoleCommandSender));
        sender.sendMessage("§2§lSitoWeb: §ahttps://gioxox.github.io/Gioxox21/" + "\n\n");
        sender.sendMessage("§4§lYouTube: §c§lhttps://youtube.com/c/Gioxox21/" + "\n\n");
        sender.sendMessage("§7§lGitHub: §f§lhttps://github.com/Gioxox" + "\n\n");

        return true;
    }
}
