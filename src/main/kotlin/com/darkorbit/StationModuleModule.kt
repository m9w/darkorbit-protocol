package com.darkorbit

interface StationModuleModule : ProtocolPacket {
	var asteroidId: Int
	var currentHitpoints: Int
	var currentShield: Int
	var emergencyRepairCost: Int
	var emergencyRepairSecondsLeft: Int
	var emergencyRepairSecondsTotal: Int
	var installationSeconds: Int
	var installationSecondsLeft: Int
	var itemId: Int
	var maxHitpoints: Int
	var maxShield: Int
	var ownerName: String
	var slotId: Int
	var type: ModuleType
	var upgradeLevel: Int
}
