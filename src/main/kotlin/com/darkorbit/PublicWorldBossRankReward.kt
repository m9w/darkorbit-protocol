package com.darkorbit

interface PublicWorldBossRankReward : ProtocolPacket {
	var from: Int
	var rewardTitleModule: RewardTitleModule
	var rewards: MutableList<RewardModule>
	var to: Int
}
