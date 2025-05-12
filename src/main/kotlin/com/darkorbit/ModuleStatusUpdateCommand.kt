package com.darkorbit

interface ModuleStatusUpdateCommand : ProtocolPacket {
	var asteroidId: Int
	var emergencyRepairSecondsLeft: Int
	var emergencyRepairSecondsTotal: Int
	var hitpoints: Int
	var hitpointsMax: Int
	var shield: Int
	var shieldMax: Int
	var slotId: Int
}
