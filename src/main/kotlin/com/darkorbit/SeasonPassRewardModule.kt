package com.darkorbit

interface SeasonPassRewardModule : ProtocolPacket {
	var amount: Int
	var claimed: Boolean
	var extGoldPass: Boolean
	var goldPass: Boolean
	var level: Int
	var lootId: String
}
