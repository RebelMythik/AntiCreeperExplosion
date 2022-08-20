package rebelmythik.anticreeperexplosion.listener;

import jdk.tools.jlink.plugin.Plugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import rebelmythik.anticreeperexplosion.AntiCreeperExplosion;

public class CancelExplosion implements Listener {

    public AntiCreeperExplosion plugin;

    public CancelExplosion(AntiCreeperExplosion plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onCreeperExplosion(EntityExplodeEvent event) {
        event.blockList().clear();
    }
}
