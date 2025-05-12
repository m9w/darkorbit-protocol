package com.darkorbit

interface WorldBossRewardsInfoCommand : ProtocolPacket {
	var currentTier: Int
	var descriptionKey: String
	var rewards: MutableList<WorldBossRewardModule>
}
