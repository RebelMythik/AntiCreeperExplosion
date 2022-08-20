package rebelmythik.anticreeperexplosion;

import org.bukkit.plugin.java.JavaPlugin;
import rebelmythik.anticreeperexplosion.listener.CancelExplosion;

public final class AntiCreeperExplosion extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new CancelExplosion(this),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
