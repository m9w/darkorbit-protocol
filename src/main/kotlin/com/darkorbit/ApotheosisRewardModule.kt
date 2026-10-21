package com.darkorbit

interface ApotheosisRewardModule : ProtocolPacket {
	var claimedCount: Int
	var rewards: MutableList<LootProbabilityModule>
	var weeklyLimit: Int
}
