package io.github.sohyeonkimdev.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class pluginclass_1 extends JavaPlugin {
	
    @Override
    public void onEnable(){
    	getLogger().info("onEnable has been invoked! pluginclass_1 플러그인이 활성화되었습니다.");
    }
    
    @Override
    public void onDisable() {
    	getLogger().info("onDisable has been invoked! pluginclass_1 플러그인이 비활성화되었습니다.");
    }
    
}
