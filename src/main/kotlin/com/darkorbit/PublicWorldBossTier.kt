package com.darkorbit

interface PublicWorldBossTier : ProtocolPacket {
	var from: Int
	var rewardModuleList: MutableList<RewardModule>
	var rewardTitleModule: RewardTitleModule
	var tierName: String
	var to: Int
}
