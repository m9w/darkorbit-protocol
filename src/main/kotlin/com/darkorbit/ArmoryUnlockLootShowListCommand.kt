package com.darkorbit

interface ArmoryUnlockLootShowListCommand : ProtocolPacket {
	var probabilityModuleList: MutableList<LootProbabilityModule>
	var resourceAmount: Int
	var resourceLootId: String
	var shipLootId: String
	var showLootCommandList: MutableList<ArmoryUnlockLootShowCommand>
}
