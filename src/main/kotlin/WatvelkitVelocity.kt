package com.github.petercrawley.watvelkit

import com.google.inject.Inject
import com.velocitypowered.api.event.EventTask
import com.velocitypowered.api.event.EventTask.async
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.proxy.ProxyServer
import org.slf4j.Logger

@Plugin(
	id = "watvelkit",
	name = "Watvelkit",
	version = "1.0",
	authors = ["Peter Crawley"]
)
class WatvelkitVelocity @Inject constructor(proxy: ProxyServer, private val slF4JLogger: Logger) {
	@Subscribe
	fun onEnable(event: ProxyInitializeEvent): EventTask = async {
		slF4JLogger.info("Watvelkit is running on Velocity!")
	}
}