package com.github.petercrawley.velkit

import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.proxy.ProxyServer
import org.slf4j.Logger

@Plugin(
	id = "velkit",
	name = "Velkit",
	version = "1.0",
	description = "A plugin that can run on Bukkit and Velocity... what an unholy combination.",
	authors = ["Peter Crawley"]
)
class VelkitVelocity @Inject constructor(proxy: ProxyServer, private val slF4JLogger: Logger) {
	@Subscribe
	fun onEnable(event: ProxyInitializeEvent) {
		slF4JLogger.info("A plugin that can run on Bukkit and Velocity... what an unholy combination.")
	}
}