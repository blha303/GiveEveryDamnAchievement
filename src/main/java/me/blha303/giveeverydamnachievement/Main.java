package me.blha303.giveeverydamnachievement;

import org.bukkit.Achievement;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public class Main extends JavaPlugin {

  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (args.length < 1) return false;
    for (String arg : args) {
      Player p = getServer().getPlayer(arg);
      if (p != null) {
        for (Achievement ach : Achievement.values()) {
          p.awardAchievement(ach);
        }
      } else {
        sender.sendMessage(ChatColor.RED + "Couldn't find a player called " + ChatColor.RESET + arg);
      }
    }
    return true;
  }
}
