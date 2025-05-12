package com.darkorbit

interface RogueLiteDroneModule : ProtocolPacket {
	var equipments: MutableList<InventoryItemModule>
	var level: Int
	var lootId: String
}
