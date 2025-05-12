package com.darkorbit

interface CPUInitializationCommand : ProtocolPacket {
	var advancedJumpCPUEquipped: Boolean
	var radarCPUEquipped: Boolean
}
