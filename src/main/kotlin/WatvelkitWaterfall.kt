package com.github.petercrawley.watvelkit

import net.md_5.bungee.api.plugin.Plugin

@Suppress("unused") // Entrypoint (Plugin)
class WatvelkitWaterfall : Plugin() {
	override fun onEnable() {
		slF4JLogger.info("Watvelkit is running on Waterfall!")
	}
}