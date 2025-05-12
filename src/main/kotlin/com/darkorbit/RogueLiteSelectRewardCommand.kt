package com.darkorbit

interface RogueLiteSelectRewardCommand : ProtocolPacket {
	var content: MutableList<InventoryItemModule>
	var module: MutableList<UnstableModuleModule>
}
