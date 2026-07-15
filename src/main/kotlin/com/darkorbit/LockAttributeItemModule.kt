package com.darkorbit

interface LockAttributeItemModule : ProtocolPacket {
	var attributes: MutableList<UnstableAttributeModule>
	var itemId: Long
	var lockAttributeLevels: MutableList<Int>
	var lockCostLoot: String
	var lockCostLootAmounts: MutableList<Int>
	var lootId: String
	var restabilizeCostLoot: String
	var restabilizeCostLootAmounts: MutableList<Int>
	var upgradeLevel: Int
}
