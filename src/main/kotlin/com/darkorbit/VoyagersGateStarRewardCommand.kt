package com.darkorbit

interface VoyagersGateStarRewardCommand : ProtocolPacket {
	var instanceLevel: Int
	var star1Loots: MutableList<LootProbabilityModule>
	var star2Loots: MutableList<LootProbabilityModule>
	var star3Loots: MutableList<LootProbabilityModule>
}
