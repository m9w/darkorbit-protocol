package com.darkorbit

interface GalaxyGateBuilderBonusGGRewardModule : ProtocolPacket {
	var amount: Int
	var claimed: Boolean
	var countdown: Int
	var lootId: String
}
