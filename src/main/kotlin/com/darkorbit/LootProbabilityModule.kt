package com.darkorbit

interface LootProbabilityModule : ProtocolPacket {
	var lootAmount: Int
	var lootId: String
	var probabilityPercentage: Double
}
