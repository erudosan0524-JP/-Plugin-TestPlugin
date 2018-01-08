package testplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

	@Override
	public void onDisable() {
		getLogger().info("プラグインが停止しました。");
	}

	@Override
	public void onEnable() {
		getLogger().info("プラグインが読み込まれました");
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {

		e.setQuitMessage(e.getPlayer().getName() + "さんが退出しました");
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		e.setJoinMessage(e.getPlayer().getName() + "さんが参加しました");
	}
	
}
