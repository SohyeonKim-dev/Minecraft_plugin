package io.github.sohyeonkimdev.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class pluginclass_1 extends JavaPlugin {
	
    @Override
    public void onEnable(){
    	getLogger().info("onEnable has been invoked! pluginclass_1 �÷������� Ȱ��ȭ�Ǿ����ϴ�.");
    }
    
    @Override
    public void onDisable() {
    	getLogger().info("onDisable has been invoked! pluginclass_1 �÷������� ��Ȱ��ȭ�Ǿ����ϴ�.");
    }
    
}
