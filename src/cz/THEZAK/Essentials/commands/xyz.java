package cz.THEZAK.Essentials.commands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cz.THEZAK.Essentials.Main;

public class xyz extends Command
{
  private Main plugin;

  public xyz(Main plugin)
  {
    super("xyz", "Get your coords!", "/xyz");
    this.plugin = plugin;
  }

  public boolean execute(CommandSender sender, String label, String[] args)
  {
    if (!this.plugin.isEnabled()) return false;
    if (!sender.hasPermission("essentials.xyz")) {
      sender.sendMessage("�cYou don't have permission!");
      return false;
    }

    if (!(sender instanceof Player)) {
      sender.sendMessage("�eYou can use this command only in game!");
      return true;
    }
    {
    if (args.length == 0) {    	
    	Player player = (Player)sender;
    	player.sendTip("\n\n\n[" + String.format("%.2f", player.getX()) + " " + String.format("%.2f", player.getY()) + " " + String.format("%.2f", player.getZ()) + "]");
    	player.sendMessage("�Coords Have Been Shown! ");
    		}
  		}
	return true;
  	}
}