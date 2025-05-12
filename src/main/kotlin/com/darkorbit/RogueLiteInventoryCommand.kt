package com.darkorbit

interface RogueLiteInventoryCommand : ProtocolPacket {
	var equipments: MutableList<InventoryItemModule>
	var inventory: MutableList<InventoryItemModule>
	var unstableModules: MutableList<UnstableModuleModule>
}
