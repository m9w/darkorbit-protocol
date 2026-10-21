package com.darkorbit

interface ApotheosisRankingEntryModule : ProtocolPacket {
	var damage: Long
	var name: String
	var rewards: MutableList<RewardModule>
	var userId: Long
}
