package com.github.petercrawley.watvelkit

import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused") // Entrypoint (Plugin)
class WatvelkitBukkit : JavaPlugin() {
	override fun onEnable() {
		slF4JLogger.info("Watvelkit is running on Bukkit!")
	}
}