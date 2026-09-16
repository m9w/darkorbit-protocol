package com.darkorbit

interface ArmoryUnlockLootShowListCommand : ProtocolPacket {
	var claimInfoCommandList: MutableList<ArmoryUnlockClaimInfoCommand>
	var group: Int
	var probabilityModuleList: MutableList<LootProbabilityModule>
	var resourceAmount: Int
	var resourceLootId: String
	var shipLootId: String
	var showLootCommandList: MutableList<ArmoryUnlockLootShowCommand>
}
