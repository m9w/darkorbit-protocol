package com.darkorbit

interface RecallBattlePassLevelModule : ProtocolPacket {
	var freeAmount: Int
	var freeClaimed: Boolean
	var freeLootId: String
	var level: Int
	var requiredExperience: Int
	var returnAmount: Int
	var returnClaimed: Boolean
	var returnLootId: String
	var vipAmount: Int
	var vipClaimed: Boolean
	var vipLootId: String
}
