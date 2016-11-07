package cz.THEZAK.Essentials.commands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cz.THEZAK.Essentials.Main;

public class gms extends Command
{
  private Main plugin;

  public gms(Main plugin)
  {
    super("gms", "Change Gamemodes Fast!", "/gms");
    this.plugin = plugin;
  }

  public boolean execute(CommandSender sender, String label, String[] args)
  {
    if (!this.plugin.isEnabled()) return false;
    if (!sender.hasPermission("essentials.gms")) {
      sender.sendMessage("�cYou don't have permission!");
      return false;
    }

    if (!(sender instanceof Player)) {
      sender.sendMessage("�eYou can use this command only in game!");
      return true;
    }
    {
    Player player = (Player)sender;
        player.setGamemode(0);
    	player.sendMessage("�7Gamemode Survival!");
    return true;
    }
  }
}