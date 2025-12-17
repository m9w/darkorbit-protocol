package com.darkorbit

interface LootProbabilityModule : ProtocolPacket {
	var lootId: String
	var maxLootAmount: Int
	var minLootAmount: Int
	var probabilityPercentage: Double
}
