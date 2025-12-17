package com.darkorbit

interface Birthday2025GateRewardCommand : ProtocolPacket {
	var costAmount: Int
	var costLootId: String
	var level: Int
	var lootProbabilityModuleList: MutableList<LootProbabilityModule>
	var lootShowCommandList: MutableList<EventLootShowCommand>
}
