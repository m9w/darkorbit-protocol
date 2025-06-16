package com.darkorbit

interface PublicWorldBossRaidIntensity : ProtocolPacket {
	var claim: Int
	var claimLimit: Int
	var currDamage: Long
	var intensity: Int
	var maxDamage: Long
	var rewards: MutableList<RewardModule>
}
