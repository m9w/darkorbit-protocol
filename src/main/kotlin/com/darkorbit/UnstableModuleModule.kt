package com.darkorbit

interface UnstableModuleModule : ProtocolPacket {
	var attributes: MutableList<UnstableAttributeModule>
	var itemId: Long
	var lootId: String
	var recycleReturns: Int
	var rerollCost: Int
	var rerollsLeft: Int
	var rerollsMax: Int
	var retainCost: MutableList<LootModule>
	var shipDesigns: MutableList<String>
}
