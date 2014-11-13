package Trubby.co.th;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class main extends JavaPlugin{

	@Override
	public void onEnable() {
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		
		if(!(sender instanceof Player))return false;
			
		if(label.equalsIgnoreCase("song")){
			Player p = (Player) sender;
			@SuppressWarnings("unused")
			BukkitTask bt = new SongTask(p.getWorld(), p.getEyeLocation()).runTaskTimer(this, 2, 2);
		}
		return false;
	}
	
}