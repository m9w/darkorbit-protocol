package com.darkorbit

interface RogueLiteGateRewardModule : ProtocolPacket {
	var amount: Int
	var level: Int
	var lootId: String
}
