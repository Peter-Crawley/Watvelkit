package com.github.petercrawley.velkit

import org.bukkit.plugin.java.JavaPlugin

class VelkitBukkit: JavaPlugin() {
	override fun onEnable() {
		slF4JLogger.info("A plugin that can run on Bukkit and Velocity... what an unholy combination.")
	}
}